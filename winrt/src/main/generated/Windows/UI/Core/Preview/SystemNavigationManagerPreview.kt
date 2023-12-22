package Windows.UI.Core.Preview

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

@ABIMarker(SystemNavigationManagerPreview.ABI::class)
@Signature("rc(Windows.UI.Core.Preview.SystemNavigationManagerPreview;{ec5f0488-6425-4777-a536-cb5634427f0d})")
@WinRTByReference(brClass = SystemNavigationManagerPreview.ByReference::class)
public class SystemNavigationManagerPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemNavigationManagerPreview.WithDefault, IWinRTObject {
  private val __96337279_Interface: ISystemNavigationManagerPreview.WithDefault by lazy {
    as_96337279()
  }


  public override val __96337279_Ptr: JNAPointer? by lazy {
    __96337279_Interface.__96337279_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__96337279_Interface)

  private fun as_96337279(): ISystemNavigationManagerPreview.WithDefault {
    if(pointer == NULL) {
      return(ISystemNavigationManagerPreview.ABI.makeISystemNavigationManagerPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemNavigationManagerPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemNavigationManagerPreview.ABI.makeISystemNavigationManagerPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemNavigationManagerPreview> {
    public override fun getValue() = SystemNavigationManagerPreview(pointer.getPointer(0))

    public fun setValue(value: SystemNavigationManagerPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemNavigationManagerPreview, MemoryAddress> {
    public val ISystemNavigationManagerPreviewStatics_Instance:
        ISystemNavigationManagerPreviewStatics by lazy {
      createISystemNavigationManagerPreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemNavigationManagerPreviewStatics():
        ISystemNavigationManagerPreviewStatics {
      val refiid = Guid.REFIID(ISystemNavigationManagerPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.Preview.SystemNavigationManagerPreview".toHandle(),refiid,interfacePtr)
      val result =
          ISystemNavigationManagerPreviewStatics.ABI.makeISystemNavigationManagerPreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemNavigationManagerPreview {
      val address = segment.toRawLongValue()
      return SystemNavigationManagerPreview(Pointer(address))
    }

    public override fun toNative(obj: SystemNavigationManagerPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.ISystemNavigationManagerPreviewStatics_Instance.GetForCurrentView()
  }
}
