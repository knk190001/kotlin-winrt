package Microsoft.UI.Xaml.Navigation

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.Animation.NavigationTransitionInfo
import Microsoft.UI.Xaml.Navigation.IPageStackEntryFactory.ABI.IID
import Windows.UI.Xaml.Interop.TypeName
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PageStackEntry.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Navigation.PageStackEntry;{d591f56e-4262-5c91-9d79-29165cd82100})")
@WinRTByReference(brClass = PageStackEntry.ByReference::class)
public class PageStackEntry(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IPageStackEntry.WithDefault, IWinRTObject {
  private val __801769438_Interface: IPageStackEntry.WithDefault by lazy {
    as_801769438()
  }


  public override val __801769438_Ptr: JNAPointer? by lazy {
    __801769438_Interface.__801769438_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__801769438_Interface)

  public constructor(
    sourcePageType: TypeName,
    parameter: IUnknown,
    navigationTransitionInfo: NavigationTransitionInfo
  ) : this(ABI.activate(sourcePageType, parameter, navigationTransitionInfo))

  private fun as_801769438(): IPageStackEntry.WithDefault {
    if(pointer == NULL) {
      return(IPageStackEntry.ABI.makeIPageStackEntry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPageStackEntry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPageStackEntry.ABI.makeIPageStackEntry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PageStackEntry>
      {
    public override fun getValue() = PageStackEntry(pointer.getPointer(0))

    public fun setValue(value: PageStackEntry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PageStackEntry, MemoryAddress> {
    public val IPageStackEntryStatics_Instance: IPageStackEntryStatics by lazy {
      createIPageStackEntryStatics()
    }


    public val IPageStackEntryFactory_Instance: IPageStackEntryFactory by lazy {
      createIPageStackEntryFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPageStackEntryStatics(): IPageStackEntryStatics {
      val refiid = Guid.REFIID(IPageStackEntryStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Navigation.PageStackEntry".toHandle(),refiid,interfacePtr)
      val result = IPageStackEntryStatics.ABI.makeIPageStackEntryStatics(interfacePtr.value)
      return result
    }

    public fun createIPageStackEntryFactory(): IPageStackEntryFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Navigation.PageStackEntry".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPageStackEntryFactory.ABI.makeIPageStackEntryFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      sourcePageType: TypeName,
      parameter: IUnknown,
      navigationTransitionInfo: NavigationTransitionInfo
    ): JNAPointer? = IPageStackEntryFactory_Instance.CreateInstance(sourcePageType, parameter,
        navigationTransitionInfo)?.pointer

    public override fun fromNative(segment: MemoryAddress): PageStackEntry {
      val address = segment.toRawLongValue()
      return PageStackEntry(Pointer(address))
    }

    public override fun toNative(obj: PageStackEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourcePageTypeProperty() =
        ABI.IPageStackEntryStatics_Instance.get_SourcePageTypeProperty()
  }
}
