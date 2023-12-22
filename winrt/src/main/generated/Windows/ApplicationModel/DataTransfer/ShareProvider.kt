package Windows.ApplicationModel.DataTransfer

import Windows.ApplicationModel.DataTransfer.IShareProviderFactory.ABI.IID
import Windows.Storage.Streams.RandomAccessStreamReference
import Windows.UI.Color
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

@ABIMarker(ShareProvider.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ShareProvider;{2fabe026-443e-4cda-af25-8d81070efd80})")
@WinRTByReference(brClass = ShareProvider.ByReference::class)
public class ShareProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShareProvider.WithDefault, IWinRTObject {
  private val __774078874_Interface: IShareProvider.WithDefault by lazy {
    as_774078874()
  }


  public override val __774078874_Ptr: JNAPointer? by lazy {
    __774078874_Interface.__774078874_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__774078874_Interface)

  public constructor(
    title: String,
    displayIcon: RandomAccessStreamReference,
    backgroundColor: Color,
    handler: ShareProviderHandler
  ) : this(ABI.activate(title, displayIcon, backgroundColor, handler))

  private fun as_774078874(): IShareProvider.WithDefault {
    if(pointer == NULL) {
      return(IShareProvider.ABI.makeIShareProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareProvider.ABI.makeIShareProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ShareProvider>
      {
    public override fun getValue() = ShareProvider(pointer.getPointer(0))

    public fun setValue(value: ShareProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShareProvider, MemoryAddress> {
    public val IShareProviderFactory_Instance: IShareProviderFactory by lazy {
      createIShareProviderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIShareProviderFactory(): IShareProviderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.ShareProvider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IShareProviderFactory.ABI.makeIShareProviderFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      title: String,
      displayIcon: RandomAccessStreamReference,
      backgroundColor: Color,
      handler: ShareProviderHandler
    ): JNAPointer? = IShareProviderFactory_Instance.Create(title, displayIcon, backgroundColor,
        handler)?.pointer

    public override fun fromNative(segment: MemoryAddress): ShareProvider {
      val address = segment.toRawLongValue()
      return ShareProvider(Pointer(address))
    }

    public override fun toNative(obj: ShareProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
