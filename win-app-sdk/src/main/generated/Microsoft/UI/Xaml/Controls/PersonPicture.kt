package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IPersonPictureFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PersonPicture.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PersonPicture;{30ec982c-0efa-5538-a356-e9ebd5aa363c})")
@WinRTByReference(brClass = PersonPicture.ByReference::class)
public open class PersonPicture(
  ptr: JNAPointer? = NULL
) : Control(ptr), IPersonPicture.WithDefault, IWinRTObject {
  private val __60166782_Interface: IPersonPicture.WithDefault by lazy {
    as_60166782()
  }


  public override val __60166782_Ptr: JNAPointer? by lazy {
    __60166782_Interface.__60166782_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__60166782_Interface)

  public constructor() : this(ABI.activate())

  private fun as_60166782(): IPersonPicture.WithDefault {
    if(pointer == NULL) {
      return(IPersonPicture.ABI.makeIPersonPicture(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPersonPicture>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPersonPicture.ABI.makeIPersonPicture(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PersonPicture>
      {
    public override fun getValue() = PersonPicture(pointer.getPointer(0))

    public fun setValue(value: PersonPicture): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PersonPicture, MemoryAddress> {
    public val IPersonPictureStatics_Instance: IPersonPictureStatics by lazy {
      createIPersonPictureStatics()
    }


    public val IPersonPictureFactory_Instance: IPersonPictureFactory by lazy {
      createIPersonPictureFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPersonPictureStatics(): IPersonPictureStatics {
      val refiid = Guid.REFIID(IPersonPictureStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PersonPicture".toHandle(),refiid,interfacePtr)
      val result = IPersonPictureStatics.ABI.makeIPersonPictureStatics(interfacePtr.value)
      return result
    }

    public fun createIPersonPictureFactory(): IPersonPictureFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PersonPicture".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPersonPictureFactory.ABI.makeIPersonPictureFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPersonPictureFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PersonPicture {
      val address = segment.toRawLongValue()
      return PersonPicture(Pointer(address))
    }

    public override fun toNative(obj: PersonPicture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BadgeNumberProperty() =
        ABI.IPersonPictureStatics_Instance.get_BadgeNumberProperty()

    public fun get_BadgeGlyphProperty() =
        ABI.IPersonPictureStatics_Instance.get_BadgeGlyphProperty()

    public fun get_BadgeImageSourceProperty() =
        ABI.IPersonPictureStatics_Instance.get_BadgeImageSourceProperty()

    public fun get_BadgeTextProperty() = ABI.IPersonPictureStatics_Instance.get_BadgeTextProperty()

    public fun get_IsGroupProperty() = ABI.IPersonPictureStatics_Instance.get_IsGroupProperty()

    public fun get_ContactProperty() = ABI.IPersonPictureStatics_Instance.get_ContactProperty()

    public fun get_DisplayNameProperty() =
        ABI.IPersonPictureStatics_Instance.get_DisplayNameProperty()

    public fun get_InitialsProperty() = ABI.IPersonPictureStatics_Instance.get_InitialsProperty()

    public fun get_PreferSmallImageProperty() =
        ABI.IPersonPictureStatics_Instance.get_PreferSmallImageProperty()

    public fun get_ProfilePictureProperty() =
        ABI.IPersonPictureStatics_Instance.get_ProfilePictureProperty()
  }
}
