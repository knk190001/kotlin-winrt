package Windows.UI.ViewManagement

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AccessibilitySettings.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.AccessibilitySettings;{fe0e8147-c4c0-4562-b962-1327b52ad5b9})")
@WinRTByReference(brClass = AccessibilitySettings.ByReference::class)
public class AccessibilitySettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccessibilitySettings.WithDefault, IWinRTObject {
  private val __1444277185_Interface: IAccessibilitySettings.WithDefault by lazy {
    as_1444277185()
  }


  public override val __1444277185_Ptr: JNAPointer? by lazy {
    __1444277185_Interface.__1444277185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1444277185_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1444277185(): IAccessibilitySettings.WithDefault {
    if(pointer == NULL) {
      return(IAccessibilitySettings.ABI.makeIAccessibilitySettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccessibilitySettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccessibilitySettings.ABI.makeIAccessibilitySettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccessibilitySettings> {
    public override fun getValue() = AccessibilitySettings(pointer.getPointer(0))

    public fun setValue(value: AccessibilitySettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccessibilitySettings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.AccessibilitySettings".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AccessibilitySettings {
      val address = segment.toRawLongValue()
      return AccessibilitySettings(Pointer(address))
    }

    public override fun toNative(obj: AccessibilitySettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
