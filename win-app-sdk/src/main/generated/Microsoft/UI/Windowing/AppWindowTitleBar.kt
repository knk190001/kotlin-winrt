package Microsoft.UI.Windowing

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppWindowTitleBar.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.AppWindowTitleBar;{5574efa2-c91c-5700-a363-539c71a7aaf4})")
@WinRTByReference(brClass = AppWindowTitleBar.ByReference::class)
public class AppWindowTitleBar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowTitleBar.WithDefault, IAppWindowTitleBar2.WithDefault, IWinRTObject
    {
  private val __1461734405_Interface: IAppWindowTitleBar.WithDefault by lazy {
    as_1461734405()
  }


  private val __1930873751_Interface: IAppWindowTitleBar2.WithDefault by lazy {
    as_1930873751()
  }


  public override val __1461734405_Ptr: JNAPointer? by lazy {
    __1461734405_Interface.__1461734405_Ptr
  }


  public override val __1930873751_Ptr: JNAPointer? by lazy {
    __1930873751_Interface.__1930873751_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1461734405_Interface, __1930873751_Interface)

  private fun as_1461734405(): IAppWindowTitleBar.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowTitleBar.ABI.makeIAppWindowTitleBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowTitleBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowTitleBar.ABI.makeIAppWindowTitleBar(ref.value))
  }

  private fun as_1930873751(): IAppWindowTitleBar2.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowTitleBar2.ABI.makeIAppWindowTitleBar2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowTitleBar2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowTitleBar2.ABI.makeIAppWindowTitleBar2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowTitleBar> {
    public override fun getValue() = AppWindowTitleBar(pointer.getPointer(0))

    public fun setValue(value: AppWindowTitleBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowTitleBar, MemoryAddress> {
    public val IAppWindowTitleBarStatics_Instance: IAppWindowTitleBarStatics by lazy {
      createIAppWindowTitleBarStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppWindowTitleBarStatics(): IAppWindowTitleBarStatics {
      val refiid = Guid.REFIID(IAppWindowTitleBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.AppWindowTitleBar".toHandle(),refiid,interfacePtr)
      val result = IAppWindowTitleBarStatics.ABI.makeIAppWindowTitleBarStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppWindowTitleBar {
      val address = segment.toRawLongValue()
      return AppWindowTitleBar(Pointer(address))
    }

    public override fun toNative(obj: AppWindowTitleBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsCustomizationSupported() =
        ABI.IAppWindowTitleBarStatics_Instance.IsCustomizationSupported()
  }
}
