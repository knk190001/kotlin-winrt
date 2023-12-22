package Windows.UI.Xaml.Documents

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(ContactContentLinkProvider.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.ContactContentLinkProvider;{f92fd29b-589b-4abd-9d37-35a1468f021e})")
@WinRTByReference(brClass = ContactContentLinkProvider.ByReference::class)
public class ContactContentLinkProvider(
  ptr: JNAPointer? = NULL
) : ContentLinkProvider(ptr), IContactContentLinkProvider.WithDefault, IWinRTObject {
  private val __589651724_Interface: IContactContentLinkProvider.WithDefault by lazy {
    as_589651724()
  }


  public override val __589651724_Ptr: JNAPointer? by lazy {
    __589651724_Interface.__589651724_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__589651724_Interface)

  public constructor() : this(ABI.activate())

  private fun as_589651724(): IContactContentLinkProvider.WithDefault {
    if(pointer == NULL) {
      return(IContactContentLinkProvider.ABI.makeIContactContentLinkProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactContentLinkProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactContentLinkProvider.ABI.makeIContactContentLinkProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactContentLinkProvider> {
    public override fun getValue() = ContactContentLinkProvider(pointer.getPointer(0))

    public fun setValue(value: ContactContentLinkProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactContentLinkProvider, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.ContactContentLinkProvider".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): ContactContentLinkProvider {
      val address = segment.toRawLongValue()
      return ContactContentLinkProvider(Pointer(address))
    }

    public override fun toNative(obj: ContactContentLinkProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
