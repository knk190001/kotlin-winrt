package Windows.UI.Shell

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

@ABIMarker(SecurityAppManager.ABI::class)
@Signature("rc(Windows.UI.Shell.SecurityAppManager;{96ac500c-aed4-561d-bde8-953520343a2d})")
@WinRTByReference(brClass = SecurityAppManager.ByReference::class)
public class SecurityAppManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecurityAppManager.WithDefault, IWinRTObject {
  private val __1987498708_Interface: ISecurityAppManager.WithDefault by lazy {
    as_1987498708()
  }


  public override val __1987498708_Ptr: JNAPointer? by lazy {
    __1987498708_Interface.__1987498708_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1987498708_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1987498708(): ISecurityAppManager.WithDefault {
    if(pointer == NULL) {
      return(ISecurityAppManager.ABI.makeISecurityAppManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecurityAppManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecurityAppManager.ABI.makeISecurityAppManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecurityAppManager> {
    public override fun getValue() = SecurityAppManager(pointer.getPointer(0))

    public fun setValue(value: SecurityAppManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecurityAppManager, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Shell.SecurityAppManager".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SecurityAppManager {
      val address = segment.toRawLongValue()
      return SecurityAppManager(Pointer(address))
    }

    public override fun toNative(obj: SecurityAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
