package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.IllegalStateException
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IReferenceArray.ABI::class)
@Guid("61c177072d6511e09ae8d48564015472")
@WinRTByReference(IReferenceArray.ByReference::class)
@TypeHash("__1195332985_Type")
public interface IReferenceArray<T> : NativeMapped, IWinRTInterface, IPropertyValue.WithDefault {
  public val __1195332985_Ptr: Pointer?

  public val _1195332985_VtblPtr: Pointer?
    get() = __1195332985_Ptr?.getPointer(0)

  public val __1195332985_Type: KType?

  public fun get_Value(): T {
    if (__1195332985_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1195332985_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<T>(__1195332985_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__1195332985_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1195332985_Type!!.arguments[0]
    return marshalFromNative<T>(result.getValue(), returnType.type!!)as T
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReferenceArray<T>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IReferenceArray<T> =
        ABI.makeIReferenceArray<T>(pointer.getPointer(0), type!!)

    public fun setValue(value: IReferenceArray<T>): Unit {
      pointer = value.__1195332985_Ptr!!
    }
  }

  public class IReferenceArrayImpl<T>(
    ptr: JNAPointer? = NULL,
    public override var __1195332985_Type: KType? = null
  ) : PointerType(ptr), IReferenceArray<T> {
    public override val __1195332985_Ptr: JNAPointer?
      get() = pointer

    public override val _1195332985_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1012155281_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IPropertyValue>())
      val result = PointerByReference()
      IUnknownVtbl(_1195332985_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <T> invoke(type: KType, ptr: JNAPointer?): IReferenceArray<T> =
          IReferenceArrayImpl(ptr, type)

      public inline operator fun <reified T> invoke(ptr: JNAPointer?): IReferenceArray<T> =
          IReferenceArrayImpl(typeOf<IReferenceArray<T>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IReferenceArray<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <T> makeIReferenceArray(ptr: JNAPointer?, type: KType) = IReferenceArrayImpl<T>(type,
        ptr)

    public inline fun <reified T> makeIReferenceArray(ptr: JNAPointer?) =
        IReferenceArrayImpl.invoke<T>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IReferenceArray<*> {
      val address = segment.toRawLongValue()
      return makeIReferenceArray<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IReferenceArray<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1195332985_Ptr))
  }
}
