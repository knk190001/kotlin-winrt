package Windows.Foundation.Collections

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IPropertySet.ABI::class)
@Guid("8a43ed9ff4e64421acf91dab2986820c")
@WinRTByReference(IPropertySet.ByReference::class)
@TypeHash("__759233417_Type")
public interface IPropertySet : NativeMapped, IWinRTInterface, IObservableMap<String?, IUnknown?>,
    IMap<String?, IUnknown?>, IIterable<IKeyValuePair<String?, IUnknown?>?> {
  public val __759233417_Ptr: Pointer?

  public val _759233417_VtblPtr: Pointer?
    get() = __759233417_Ptr?.getPointer(0)

  public override val __1606815573_Type: KType
    get() = IObservableMap::class.createType(listOf(
      KTypeProjection(INVARIANT,String::class.createType()),
      KTypeProjection(INVARIANT,IUnknown::class.createType()),
    ))

  public override val __8028824_Type: KType
    get() = IMap::class.createType(listOf(
      KTypeProjection(INVARIANT,String::class.createType()),
      KTypeProjection(INVARIANT,IUnknown::class.createType()),
    ))

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IKeyValuePair::class.createType(listOf(
        KTypeProjection(INVARIANT,String::class.createType()),
        KTypeProjection(INVARIANT,IUnknown::class.createType()),
      ))),
    ))

  public interface WithDefault : IPropertySet

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPropertySet> {
    public override fun getValue(): IPropertySet = ABI.makeIPropertySet(pointer.getPointer(0))

    public fun setValue(value: IPropertySet): Unit {
      pointer = value.__759233417_Ptr!!
    }
  }

  public class IPropertySetImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __759233417_Ptr: JNAPointer?
      get() = pointer

    public override val _759233417_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1606815573_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IObservableMap<String?,
          IUnknown?>>())
      val result = PointerByReference()
      IUnknownVtbl(_759233417_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __8028824_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IMap<String?, IUnknown?>>())
      val result = PointerByReference()
      IUnknownVtbl(_759233417_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?,
          IUnknown?>?>>())
      val result = PointerByReference()
      IUnknownVtbl(_759233417_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IPropertySet = IPropertySetImpl(ptr)
    }
  }

  public object ABI : IABI<IPropertySet, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertySet(ptr: JNAPointer?) = IPropertySetImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertySet {
      val address = segment.toRawLongValue()
      return makeIPropertySet(Pointer(address))
    }

    public override fun toNative(obj: IPropertySet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__759233417_Ptr))
  }
}
