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
@ABIMarker(IReference.ABI::class)
@Guid("61c177062d6511e09ae8d48564015472")
@WinRTByReference(IReference.ByReference::class)
@TypeHash("__863820608_Type")
public interface IReference<T> : NativeMapped, IWinRTInterface, IPropertyValue.WithDefault {
  public val __863820608_Ptr: Pointer?

  public val _863820608_VtblPtr: Pointer?
    get() = __863820608_Ptr?.getPointer(0)

  public val __863820608_Type: KType?

  public fun get_Value(): T {
    if (__863820608_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _863820608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<T>(__863820608_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__863820608_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __863820608_Type!!.arguments[0]
    return marshalFromNative<T>(result.getValue(), returnType.type!!)as T
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReference<T>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IReference<T> = ABI.makeIReference<T>(pointer.getPointer(0),
        type!!)

    public fun setValue(value: IReference<T>): Unit {
      pointer = value.__863820608_Ptr!!
    }
  }

  public class IReferenceImpl<T>(
    ptr: JNAPointer? = NULL,
    public override var __863820608_Type: KType? = null
  ) : PointerType(ptr), IReference<T> {
    public override val __863820608_Ptr: JNAPointer?
      get() = pointer

    public override val _863820608_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1012155281_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IPropertyValue>())
      val result = PointerByReference()
      IUnknownVtbl(_863820608_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <T> invoke(type: KType, ptr: JNAPointer?): IReference<T> =
          IReferenceImpl(ptr, type)

      public inline operator fun <reified T> invoke(ptr: JNAPointer?): IReference<T> =
          IReferenceImpl(typeOf<IReference<T>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IReference<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <T> makeIReference(ptr: JNAPointer?, type: KType) = IReferenceImpl<T>(type, ptr)

    public inline fun <reified T> makeIReference(ptr: JNAPointer?) = IReferenceImpl.invoke<T>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IReference<*> {
      val address = segment.toRawLongValue()
      return makeIReference<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IReference<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__863820608_Ptr))
  }
}
