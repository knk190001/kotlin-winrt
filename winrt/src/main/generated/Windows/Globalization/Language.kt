package Windows.Globalization

import Windows.Foundation.Collections.IIterable
import Windows.Globalization.ILanguageFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Language.ABI::class)
@Signature("rc(Windows.Globalization.Language;{ea79a752-f7c2-4265-b1bd-c4dec4e4f080})")
@WinRTByReference(brClass = Language.ByReference::class)
public class Language(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILanguage.WithDefault, ILanguageExtensionSubtags.WithDefault,
    ILanguage2.WithDefault, ILanguage3.WithDefault, IWinRTObject {
  private val __1178540917_Interface: ILanguage.WithDefault by lazy {
    as_1178540917()
  }


  private val __258634811_Interface: ILanguageExtensionSubtags.WithDefault by lazy {
    as_258634811()
  }


  private val __2119937287_Interface: ILanguage2.WithDefault by lazy {
    as_2119937287()
  }


  private val __2119937288_Interface: ILanguage3.WithDefault by lazy {
    as_2119937288()
  }


  public override val __1178540917_Ptr: JNAPointer? by lazy {
    __1178540917_Interface.__1178540917_Ptr
  }


  public override val __258634811_Ptr: JNAPointer? by lazy {
    __258634811_Interface.__258634811_Ptr
  }


  public override val __2119937287_Ptr: JNAPointer? by lazy {
    __2119937287_Interface.__2119937287_Ptr
  }


  public override val __2119937288_Ptr: JNAPointer? by lazy {
    __2119937288_Interface.__2119937288_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1178540917_Interface, __258634811_Interface, __2119937287_Interface,
        __2119937288_Interface)

  public constructor(languageTag: String) : this(ABI.activate(languageTag))

  private fun as_1178540917(): ILanguage.WithDefault {
    if(pointer == NULL) {
      return(ILanguage.ABI.makeILanguage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILanguage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILanguage.ABI.makeILanguage(ref.value))
  }

  private fun as_258634811(): ILanguageExtensionSubtags.WithDefault {
    if(pointer == NULL) {
      return(ILanguageExtensionSubtags.ABI.makeILanguageExtensionSubtags(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILanguageExtensionSubtags>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILanguageExtensionSubtags.ABI.makeILanguageExtensionSubtags(ref.value))
  }

  private fun as_2119937287(): ILanguage2.WithDefault {
    if(pointer == NULL) {
      return(ILanguage2.ABI.makeILanguage2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILanguage2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILanguage2.ABI.makeILanguage2(ref.value))
  }

  private fun as_2119937288(): ILanguage3.WithDefault {
    if(pointer == NULL) {
      return(ILanguage3.ABI.makeILanguage3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILanguage3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILanguage3.ABI.makeILanguage3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Language> {
    public override fun getValue() = Language(pointer.getPointer(0))

    public fun setValue(value: Language): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Language, MemoryAddress> {
    public val ILanguageStatics_Instance: ILanguageStatics by lazy {
      createILanguageStatics()
    }


    public val ILanguageStatics3_Instance: ILanguageStatics3 by lazy {
      createILanguageStatics3()
    }


    public val ILanguageStatics2_Instance: ILanguageStatics2 by lazy {
      createILanguageStatics2()
    }


    public val ILanguageFactory_Instance: ILanguageFactory by lazy {
      createILanguageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILanguageStatics(): ILanguageStatics {
      val refiid = Guid.REFIID(ILanguageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.Language".toHandle(),refiid,interfacePtr)
      val result = ILanguageStatics.ABI.makeILanguageStatics(interfacePtr.value)
      return result
    }

    public fun createILanguageStatics3(): ILanguageStatics3 {
      val refiid = Guid.REFIID(ILanguageStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.Language".toHandle(),refiid,interfacePtr)
      val result = ILanguageStatics3.ABI.makeILanguageStatics3(interfacePtr.value)
      return result
    }

    public fun createILanguageStatics2(): ILanguageStatics2 {
      val refiid = Guid.REFIID(ILanguageStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.Language".toHandle(),refiid,interfacePtr)
      val result = ILanguageStatics2.ABI.makeILanguageStatics2(interfacePtr.value)
      return result
    }

    public fun createILanguageFactory(): ILanguageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.Language".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILanguageFactory.ABI.makeILanguageFactory(factoryActivatorPtr.value))
    }

    public fun activate(languageTag: String): JNAPointer? =
        ILanguageFactory_Instance.CreateLanguage(languageTag)?.pointer

    public override fun fromNative(segment: MemoryAddress): Language {
      val address = segment.toRawLongValue()
      return Language(Pointer(address))
    }

    public override fun toNative(obj: Language): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsWellFormed(languageTag: String) =
        ABI.ILanguageStatics_Instance.IsWellFormed(languageTag)

    public fun get_CurrentInputMethodLanguageTag() =
        ABI.ILanguageStatics_Instance.get_CurrentInputMethodLanguageTag()

    public fun GetMuiCompatibleLanguageListFromLanguageTags(languageTags: IIterable<String?>) =
        ABI.ILanguageStatics3_Instance.GetMuiCompatibleLanguageListFromLanguageTags(languageTags)

    public fun TrySetInputMethodLanguageTag(languageTag: String) =
        ABI.ILanguageStatics2_Instance.TrySetInputMethodLanguageTag(languageTag)
  }
}
