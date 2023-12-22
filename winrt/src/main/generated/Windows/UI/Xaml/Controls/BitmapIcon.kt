package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IBitmapIconFactory.ABI.IID
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

@ABIMarker(BitmapIcon.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.BitmapIcon;{e8fe17cb-35f7-40f3-a185-48b397b73e68})")
@WinRTByReference(brClass = BitmapIcon.ByReference::class)
public open class BitmapIcon(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), IBitmapIcon.WithDefault, IBitmapIcon2.WithDefault, IWinRTObject {
  private val __1028676452_Interface: IBitmapIcon.WithDefault by lazy {
    as_1028676452()
  }


  private val __1824198990_Interface: IBitmapIcon2.WithDefault by lazy {
    as_1824198990()
  }


  public override val __1028676452_Ptr: JNAPointer? by lazy {
    __1028676452_Interface.__1028676452_Ptr
  }


  public override val __1824198990_Ptr: JNAPointer? by lazy {
    __1824198990_Interface.__1824198990_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1028676452_Interface, __1824198990_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1028676452(): IBitmapIcon.WithDefault {
    if(pointer == NULL) {
      return(IBitmapIcon.ABI.makeIBitmapIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapIcon.ABI.makeIBitmapIcon(ref.value))
  }

  private fun as_1824198990(): IBitmapIcon2.WithDefault {
    if(pointer == NULL) {
      return(IBitmapIcon2.ABI.makeIBitmapIcon2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapIcon2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapIcon2.ABI.makeIBitmapIcon2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BitmapIcon> {
    public override fun getValue() = BitmapIcon(pointer.getPointer(0))

    public fun setValue(value: BitmapIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapIcon, MemoryAddress> {
    public val IBitmapIconStatics2_Instance: IBitmapIconStatics2 by lazy {
      createIBitmapIconStatics2()
    }


    public val IBitmapIconStatics_Instance: IBitmapIconStatics by lazy {
      createIBitmapIconStatics()
    }


    public val IBitmapIconFactory_Instance: IBitmapIconFactory by lazy {
      createIBitmapIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBitmapIconStatics2(): IBitmapIconStatics2 {
      val refiid = Guid.REFIID(IBitmapIconStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.BitmapIcon".toHandle(),refiid,interfacePtr)
      val result = IBitmapIconStatics2.ABI.makeIBitmapIconStatics2(interfacePtr.value)
      return result
    }

    public fun createIBitmapIconStatics(): IBitmapIconStatics {
      val refiid = Guid.REFIID(IBitmapIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.BitmapIcon".toHandle(),refiid,interfacePtr)
      val result = IBitmapIconStatics.ABI.makeIBitmapIconStatics(interfacePtr.value)
      return result
    }

    public fun createIBitmapIconFactory(): IBitmapIconFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.BitmapIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBitmapIconFactory.ABI.makeIBitmapIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBitmapIconFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BitmapIcon {
      val address = segment.toRawLongValue()
      return BitmapIcon(Pointer(address))
    }

    public override fun toNative(obj: BitmapIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ShowAsMonochromeProperty() =
        ABI.IBitmapIconStatics2_Instance.get_ShowAsMonochromeProperty()

    public fun get_UriSourceProperty() = ABI.IBitmapIconStatics_Instance.get_UriSourceProperty()
  }
}
