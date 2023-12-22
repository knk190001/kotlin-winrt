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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IMapView.ABI::class)
@Guid("e480ce40a3384adaadcf272272e48cb9")
@WinRTByReference(IMapView.ByReference::class)
@TypeHash("__1676682589_Type")
public interface IMapView<K, V> : NativeMapped, IWinRTInterface, IIterable<IKeyValuePair<K, V>?> {
  public val __1676682589_Ptr: Pointer?

  public val _1676682589_VtblPtr: Pointer?
    get() = __1676682589_Ptr?.getPointer(0)

  public val __1676682589_Type: KType?

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IKeyValuePair::class.createType(listOf(
        __1676682589_Type!!.arguments[0],
        __1676682589_Type!!.arguments[1],
      ))),
    ))

  public fun Lookup(key: K): V {
    if (__1676682589_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1676682589_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<V>(__1676682589_Type!!.arguments[1].type!!)
    val hr =
        fn.invokeHR(arrayOf(__1676682589_Ptr,marshalToNative(key,__1676682589_Type!!.arguments[0].type!!),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1676682589_Type!!.arguments[1]
    return marshalFromNative<V>(result.getValue(), returnType.type!!)as V
  }

  public fun get_Size(): WinDef.UINT {
    if (__1676682589_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1676682589_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<WinDef.UINT>()
    val hr = fn.invokeHR(arrayOf(__1676682589_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = WinDef.UINT::class.createType()
    return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
  }

  public fun HasKey(key: K): Boolean {
    if (__1676682589_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1676682589_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<Boolean>()
    val hr =
        fn.invokeHR(arrayOf(__1676682589_Ptr,marshalToNative(key,__1676682589_Type!!.arguments[0].type!!),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = Boolean::class.createType()
    return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
  }

  public fun Split(first: ByReference<K, V>?, second: ByReference<K, V>?): Unit {
    if (__1676682589_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1676682589_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1676682589_Ptr,marshalToNative(first), marshalToNative(second)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference<K, V> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapView<K, V>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IMapView<K, V> = ABI.makeIMapView<K, V>(pointer.getPointer(0),
        type!!)

    public fun setValue(value: IMapView<K, V>): Unit {
      pointer = value.__1676682589_Ptr!!
    }
  }

  public class IMapViewImpl<K, V>(
    ptr: JNAPointer? = NULL,
    public override var __1676682589_Type: KType? = null
  ) : PointerType(ptr), IMapView<K, V> {
    public override val __1676682589_Ptr: JNAPointer?
      get() = pointer

    public override val _1676682589_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf(__1449643190_Type))
      val result = PointerByReference()
      IUnknownVtbl(_1676682589_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <K, V> invoke(type: KType, ptr: JNAPointer?): IMapView<K, V> =
          IMapViewImpl(ptr, type)

      public inline operator fun <reified K, reified V> invoke(ptr: JNAPointer?): IMapView<K, V> =
          IMapViewImpl(typeOf<IMapView<K, V>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IMapView<*, *>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <K, V> makeIMapView(ptr: JNAPointer?, type: KType) = IMapViewImpl<K, V>(type, ptr)

    public inline fun <reified K, reified V> makeIMapView(ptr: JNAPointer?) = IMapViewImpl.invoke<K,
        V>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IMapView<*, *> {
      val address = segment.toRawLongValue()
      return makeIMapView<Unit, Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IMapView<*, *>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1676682589_Ptr))
  }
}
