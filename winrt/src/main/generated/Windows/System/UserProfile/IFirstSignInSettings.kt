package Windows.System.UserProfile

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
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
@ABIMarker(IFirstSignInSettings.ABI::class)
@Guid("3e9451533a5e452ea601f5baad2a4870")
@WinRTByReference(IFirstSignInSettings.ByReference::class)
@TypeHash("__1946829738_Type")
public interface IFirstSignInSettings : NativeMapped, IWinRTInterface, IMapView<String?, IUnknown?>,
    IIterable<IKeyValuePair<String?, IUnknown?>?> {
  public val __1946829738_Ptr: Pointer?

  public val _1946829738_VtblPtr: Pointer?
    get() = __1946829738_Ptr?.getPointer(0)

  public override val __1676682589_Type: KType
    get() = IMapView::class.createType(listOf(
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

  public interface WithDefault : IFirstSignInSettings

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFirstSignInSettings> {
    public override fun getValue(): IFirstSignInSettings =
        ABI.makeIFirstSignInSettings(pointer.getPointer(0))

    public fun setValue(value: IFirstSignInSettings): Unit {
      pointer = value.__1946829738_Ptr!!
    }
  }

  public class IFirstSignInSettingsImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __1946829738_Ptr: JNAPointer?
      get() = pointer

    public override val _1946829738_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1676682589_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IMapView<String?, IUnknown?>>())
      val result = PointerByReference()
      IUnknownVtbl(_1946829738_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?,
          IUnknown?>?>>())
      val result = PointerByReference()
      IUnknownVtbl(_1946829738_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IFirstSignInSettings =
          IFirstSignInSettingsImpl(ptr)
    }
  }

  public object ABI : IABI<IFirstSignInSettings, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIFirstSignInSettings(ptr: JNAPointer?) = IFirstSignInSettingsImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): IFirstSignInSettings {
      val address = segment.toRawLongValue()
      return makeIFirstSignInSettings(Pointer(address))
    }

    public override fun toNative(obj: IFirstSignInSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946829738_Ptr))
  }
}
