package Windows.Foundation.Collections

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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.IllegalStateException
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IVectorView.ABI::class)
@Guid("bbe1fa4cb0e34583baef1f1b2e483e56")
@WinRTByReference(IVectorView.ByReference::class)
@TypeHash("__970637876_Type")
public interface IVectorView<T> : NativeMapped, IWinRTInterface, IIterable<T> {
  public val __970637876_Ptr: Pointer?

  public val _970637876_VtblPtr: Pointer?
    get() = __970637876_Ptr?.getPointer(0)

  public val __970637876_Type: KType?

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      __970637876_Type!!.arguments[0],
    ))

  public fun GetAt(index: WinDef.UINT): T {
    if (__970637876_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _970637876_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<T>(__970637876_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__970637876_Ptr,marshalToNative(index),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __970637876_Type!!.arguments[0]
    return marshalFromNative<T>(result.getValue(), returnType.type!!)as T
  }

  public fun get_Size(): WinDef.UINT {
    if (__970637876_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _970637876_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<WinDef.UINT>()
    val hr = fn.invokeHR(arrayOf(__970637876_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = WinDef.UINT::class.createType()
    return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
  }

  public fun IndexOf(value: T, index: WinDef.UINT): Boolean {
    if (__970637876_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _970637876_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<Boolean>()
    val hr =
        fn.invokeHR(arrayOf(__970637876_Ptr,marshalToNative(value,__970637876_Type!!.arguments[0].type!!),
        marshalToNative(index),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = Boolean::class.createType()
    return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<T>): WinDef.UINT {
    if (__970637876_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _970637876_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<WinDef.UINT>()
    val hr = fn.invokeHR(arrayOf(__970637876_Ptr,marshalToNative(startIndex),
        marshalToNative(items,__970637876_Type!!.arguments[0].type!!),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = WinDef.UINT::class.createType()
    return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVectorView<T>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IVectorView<T> = ABI.makeIVectorView<T>(pointer.getPointer(0),
        type!!)

    public fun setValue(value: IVectorView<T>): Unit {
      pointer = value.__970637876_Ptr!!
    }
  }

  public class IVectorViewImpl<T>(
    ptr: JNAPointer? = NULL,
    public override var __970637876_Type: KType? = null
  ) : PointerType(ptr), IVectorView<T> {
    public override val __970637876_Ptr: JNAPointer?
      get() = pointer

    public override val _970637876_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf(__1449643190_Type))
      val result = PointerByReference()
      IUnknownVtbl(_970637876_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <T> invoke(type: KType, ptr: JNAPointer?): IVectorView<T> =
          IVectorViewImpl(ptr, type)

      public inline operator fun <reified T> invoke(ptr: JNAPointer?): IVectorView<T> =
          IVectorViewImpl(typeOf<IVectorView<T>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IVectorView<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <T> makeIVectorView(ptr: JNAPointer?, type: KType) = IVectorViewImpl<T>(type, ptr)

    public inline fun <reified T> makeIVectorView(ptr: JNAPointer?) = IVectorViewImpl.invoke<T>(
        ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IVectorView<*> {
      val address = segment.toRawLongValue()
      return makeIVectorView<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IVectorView<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__970637876_Ptr))
  }
}
