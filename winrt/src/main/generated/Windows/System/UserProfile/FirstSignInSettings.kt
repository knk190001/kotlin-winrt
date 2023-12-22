package Windows.System.UserProfile

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(FirstSignInSettings.ABI::class)
@Signature("rc(Windows.System.UserProfile.FirstSignInSettings;{3e945153-3a5e-452e-a601-f5baad2a4870})")
@WinRTByReference(brClass = FirstSignInSettings.ByReference::class)
public class FirstSignInSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFirstSignInSettings.WithDefault, IMapView<String?, IUnknown?>,
    IIterable<IKeyValuePair<String?, IUnknown?>?>, IWinRTObject {
  private val __1946829738_Interface: IFirstSignInSettings.WithDefault by lazy {
    as_1946829738()
  }


  private val __1676682589_Interface: IMapView<String?, IUnknown?> by lazy {
    as_1676682589()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, IUnknown?>?> by lazy {
    as_1449643190()
  }


  public override val __1676682589_Type: KType = typeOf<IMapView<String?, IUnknown?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      IUnknown?>?>>()

  public override val __1946829738_Ptr: JNAPointer? by lazy {
    __1946829738_Interface.__1946829738_Ptr
  }


  public override val __1676682589_Ptr: JNAPointer? by lazy {
    __1676682589_Interface.__1676682589_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1946829738_Interface, __1676682589_Interface, __1449643190_Interface)

  private fun as_1946829738(): IFirstSignInSettings.WithDefault {
    if(pointer == NULL) {
      return(IFirstSignInSettings.ABI.makeIFirstSignInSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFirstSignInSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFirstSignInSettings.ABI.makeIFirstSignInSettings(ref.value))
  }

  private fun as_1676682589(): IMapView<String?, IUnknown?> {
    if(pointer == NULL) {
      return(IMapView.ABI.makeIMapView<String?, IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapView<String?, IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapView.ABI.makeIMapView<String?, IUnknown?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, IUnknown?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IUnknown?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, IUnknown?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IUnknown?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FirstSignInSettings> {
    public override fun getValue() = FirstSignInSettings(pointer.getPointer(0))

    public fun setValue(value: FirstSignInSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FirstSignInSettings, MemoryAddress> {
    public val IFirstSignInSettingsStatics_Instance: IFirstSignInSettingsStatics by lazy {
      createIFirstSignInSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFirstSignInSettingsStatics(): IFirstSignInSettingsStatics {
      val refiid = Guid.REFIID(IFirstSignInSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.FirstSignInSettings".toHandle(),refiid,interfacePtr)
      val result =
          IFirstSignInSettingsStatics.ABI.makeIFirstSignInSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FirstSignInSettings {
      val address = segment.toRawLongValue()
      return FirstSignInSettings(Pointer(address))
    }

    public override fun toNative(obj: FirstSignInSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IFirstSignInSettingsStatics_Instance.GetDefault()
  }
}
