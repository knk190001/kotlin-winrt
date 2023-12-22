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
@ABIMarker(IMapChangedEventArgs.ABI::class)
@Guid("9939f4df050a4c0faa6077075f9c4777")
@WinRTByReference(IMapChangedEventArgs.ByReference::class)
@TypeHash("__1281751291_Type")
public interface IMapChangedEventArgs<K> : NativeMapped, IWinRTInterface {
  public val __1281751291_Ptr: Pointer?

  public val _1281751291_VtblPtr: Pointer?
    get() = __1281751291_Ptr?.getPointer(0)

  public val __1281751291_Type: KType?

  public fun get_CollectionChange(): CollectionChange? {
    if (__1281751291_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1281751291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<CollectionChange>()
    val hr = fn.invokeHR(arrayOf(__1281751291_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = CollectionChange::class.createType()
    return marshalFromNative<CollectionChange>(result.getValue(), returnType!!)
  }

  public fun get_Key(): K {
    if (__1281751291_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1281751291_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<K>(__1281751291_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__1281751291_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1281751291_Type!!.arguments[0]
    return marshalFromNative<K>(result.getValue(), returnType.type!!)as K
  }

  public class ByReference<K> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapChangedEventArgs<K>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IMapChangedEventArgs<K> =
        ABI.makeIMapChangedEventArgs<K>(pointer.getPointer(0), type!!)

    public fun setValue(value: IMapChangedEventArgs<K>): Unit {
      pointer = value.__1281751291_Ptr!!
    }
  }

  public class IMapChangedEventArgsImpl<K>(
    ptr: JNAPointer? = NULL,
    public override var __1281751291_Type: KType? = null
  ) : PointerType(ptr), IMapChangedEventArgs<K> {
    public override val __1281751291_Ptr: JNAPointer?
      get() = pointer

    public override val _1281751291_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public companion object {
      public operator fun <K> invoke(type: KType, ptr: JNAPointer?): IMapChangedEventArgs<K> =
          IMapChangedEventArgsImpl(ptr, type)

      public inline operator fun <reified K> invoke(ptr: JNAPointer?): IMapChangedEventArgs<K> =
          IMapChangedEventArgsImpl(typeOf<IMapChangedEventArgs<K>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IMapChangedEventArgs<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <K> makeIMapChangedEventArgs(ptr: JNAPointer?, type: KType) =
        IMapChangedEventArgsImpl<K>(type, ptr)

    public inline fun <reified K> makeIMapChangedEventArgs(ptr: JNAPointer?) =
        IMapChangedEventArgsImpl.invoke<K>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IMapChangedEventArgs<*> {
      val address = segment.toRawLongValue()
      return makeIMapChangedEventArgs<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IMapChangedEventArgs<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1281751291_Ptr))
  }
}
