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

@ABIMarker(PlaceContentLinkProvider.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.PlaceContentLinkProvider;{10348a4c-2366-41be-90c8-3258b53b5483})")
@WinRTByReference(brClass = PlaceContentLinkProvider.ByReference::class)
public class PlaceContentLinkProvider(
  ptr: JNAPointer? = NULL
) : ContentLinkProvider(ptr), IPlaceContentLinkProvider.WithDefault, IWinRTObject {
  private val __1002079429_Interface: IPlaceContentLinkProvider.WithDefault by lazy {
    as_1002079429()
  }


  public override val __1002079429_Ptr: JNAPointer? by lazy {
    __1002079429_Interface.__1002079429_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1002079429_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1002079429(): IPlaceContentLinkProvider.WithDefault {
    if(pointer == NULL) {
      return(IPlaceContentLinkProvider.ABI.makeIPlaceContentLinkProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaceContentLinkProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaceContentLinkProvider.ABI.makeIPlaceContentLinkProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaceContentLinkProvider> {
    public override fun getValue() = PlaceContentLinkProvider(pointer.getPointer(0))

    public fun setValue(value: PlaceContentLinkProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaceContentLinkProvider, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.PlaceContentLinkProvider".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PlaceContentLinkProvider {
      val address = segment.toRawLongValue()
      return PlaceContentLinkProvider(Pointer(address))
    }

    public override fun toNative(obj: PlaceContentLinkProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
