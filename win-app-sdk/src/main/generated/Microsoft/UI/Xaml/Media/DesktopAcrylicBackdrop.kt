package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.Media.IDesktopAcrylicBackdropFactory.ABI.IID
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

@ABIMarker(DesktopAcrylicBackdrop.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.DesktopAcrylicBackdrop;{bfd9915b-82a6-5df6-aff0-a4824ddc1143})")
@WinRTByReference(brClass = DesktopAcrylicBackdrop.ByReference::class)
public open class DesktopAcrylicBackdrop(
  ptr: JNAPointer? = NULL
) : SystemBackdrop(ptr), IDesktopAcrylicBackdrop.WithDefault, IWinRTObject {
  private val __531460824_Interface: IDesktopAcrylicBackdrop.WithDefault by lazy {
    as_531460824()
  }


  public override val __531460824_Ptr: JNAPointer? by lazy {
    __531460824_Interface.__531460824_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__531460824_Interface)

  public constructor() : this(ABI.activate())

  private fun as_531460824(): IDesktopAcrylicBackdrop.WithDefault {
    if(pointer == NULL) {
      return(IDesktopAcrylicBackdrop.ABI.makeIDesktopAcrylicBackdrop(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopAcrylicBackdrop>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopAcrylicBackdrop.ABI.makeIDesktopAcrylicBackdrop(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesktopAcrylicBackdrop> {
    public override fun getValue() = DesktopAcrylicBackdrop(pointer.getPointer(0))

    public fun setValue(value: DesktopAcrylicBackdrop): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesktopAcrylicBackdrop, MemoryAddress> {
    public val IDesktopAcrylicBackdropFactory_Instance: IDesktopAcrylicBackdropFactory by lazy {
      createIDesktopAcrylicBackdropFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDesktopAcrylicBackdropFactory(): IDesktopAcrylicBackdropFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.DesktopAcrylicBackdrop".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDesktopAcrylicBackdropFactory.ABI.makeIDesktopAcrylicBackdropFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IDesktopAcrylicBackdropFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DesktopAcrylicBackdrop {
      val address = segment.toRawLongValue()
      return DesktopAcrylicBackdrop(Pointer(address))
    }

    public override fun toNative(obj: DesktopAcrylicBackdrop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
