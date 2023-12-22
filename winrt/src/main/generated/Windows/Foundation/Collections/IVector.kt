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
@ABIMarker(IVector.ABI::class)
@Guid("913337e911a14345a3a24e7f956e222d")
@WinRTByReference(IVector.ByReference::class)
@TypeHash("__1070388601_Type")
public interface IVector<T> : NativeMapped, IWinRTInterface, IIterable<T> {
  public val __1070388601_Ptr: Pointer?

  public val _1070388601_VtblPtr: Pointer?
    get() = __1070388601_Ptr?.getPointer(0)

  public val __1070388601_Type: KType?

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      __1070388601_Type!!.arguments[0],
    ))

  public fun GetAt(index: WinDef.UINT): T {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<T>(__1070388601_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,marshalToNative(index),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1070388601_Type!!.arguments[0]
    return marshalFromNative<T>(result.getValue(), returnType.type!!)as T
  }

  public fun get_Size(): WinDef.UINT {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<WinDef.UINT>()
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = WinDef.UINT::class.createType()
    return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
  }

  public fun GetView(): IVectorView<T>? {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<IVectorView<T>>(
    IVectorView::class.createType(listOf(
      __1070388601_Type!!.arguments[0],
    )))
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = IVectorView::class.createType(listOf(
      __1070388601_Type!!.arguments[0],
    ))
    return marshalFromNative<IVectorView<T>>(result.getValue(), returnType!!)
  }

  public fun IndexOf(value: T, index: WinDef.UINT): Boolean {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<Boolean>()
    val hr =
        fn.invokeHR(arrayOf(__1070388601_Ptr,marshalToNative(value,__1070388601_Type!!.arguments[0].type!!),
        marshalToNative(index),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = Boolean::class.createType()
    return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
  }

  public fun SetAt(index: WinDef.UINT, value: T): Unit {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,marshalToNative(index),
        marshalToNative(value,__1070388601_Type!!.arguments[0].type!!)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun InsertAt(index: WinDef.UINT, value: T): Unit {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(11L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,marshalToNative(index),
        marshalToNative(value,__1070388601_Type!!.arguments[0].type!!)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveAt(index: WinDef.UINT): Unit {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(12L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,marshalToNative(index)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Append(value: T): Unit {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(13L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr =
        fn.invokeHR(arrayOf(__1070388601_Ptr,marshalToNative(value,__1070388601_Type!!.arguments[0].type!!)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun RemoveAtEnd(): Unit {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(14L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun Clear(): Unit {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(15L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun GetMany(startIndex: WinDef.UINT, items: Array<T>): WinDef.UINT {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(16L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<WinDef.UINT>()
    val hr = fn.invokeHR(arrayOf(__1070388601_Ptr,marshalToNative(startIndex),
        marshalToNative(items,__1070388601_Type!!.arguments[0].type!!),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = WinDef.UINT::class.createType()
    return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
  }

  public fun ReplaceAll(items: Array<T>): Unit {
    if (__1070388601_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1070388601_VtblPtr!!.getPointer(17L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr =
        fn.invokeHR(arrayOf(__1070388601_Ptr,marshalToNative(items,__1070388601_Type!!.arguments[0].type!!)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVector<T>>,
      ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IVector<T> = ABI.makeIVector<T>(pointer.getPointer(0), type!!)

    public fun setValue(value: IVector<T>): Unit {
      pointer = value.__1070388601_Ptr!!
    }
  }

  public class IVectorImpl<T>(
    ptr: JNAPointer? = NULL,
    public override var __1070388601_Type: KType? = null
  ) : PointerType(ptr), IVector<T> {
    public override val __1070388601_Ptr: JNAPointer?
      get() = pointer

    public override val _1070388601_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf(__1449643190_Type))
      val result = PointerByReference()
      IUnknownVtbl(_1070388601_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <T> invoke(type: KType, ptr: JNAPointer?): IVector<T> = IVectorImpl(ptr,
          type)

      public inline operator fun <reified T> invoke(ptr: JNAPointer?): IVector<T> =
          IVectorImpl(typeOf<IVector<T>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IVector<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <T> makeIVector(ptr: JNAPointer?, type: KType) = IVectorImpl<T>(type, ptr)

    public inline fun <reified T> makeIVector(ptr: JNAPointer?) = IVectorImpl.invoke<T>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IVector<*> {
      val address = segment.toRawLongValue()
      return makeIVector<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IVector<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1070388601_Ptr))
  }
}
