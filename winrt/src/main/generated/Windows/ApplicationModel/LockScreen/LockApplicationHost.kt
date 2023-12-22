package Windows.ApplicationModel.LockScreen

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

@ABIMarker(LockApplicationHost.ABI::class)
@Signature("rc(Windows.ApplicationModel.LockScreen.LockApplicationHost;{38ee31ad-d94f-4e7c-81fa-4f4436506281})")
@WinRTByReference(brClass = LockApplicationHost.ByReference::class)
public class LockApplicationHost(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILockApplicationHost.WithDefault, IWinRTObject {
  private val __942611109_Interface: ILockApplicationHost.WithDefault by lazy {
    as_942611109()
  }


  public override val __942611109_Ptr: JNAPointer? by lazy {
    __942611109_Interface.__942611109_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__942611109_Interface)

  private fun as_942611109(): ILockApplicationHost.WithDefault {
    if(pointer == NULL) {
      return(ILockApplicationHost.ABI.makeILockApplicationHost(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILockApplicationHost>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILockApplicationHost.ABI.makeILockApplicationHost(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LockApplicationHost> {
    public override fun getValue() = LockApplicationHost(pointer.getPointer(0))

    public fun setValue(value: LockApplicationHost): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LockApplicationHost, MemoryAddress> {
    public val ILockApplicationHostStatics_Instance: ILockApplicationHostStatics by lazy {
      createILockApplicationHostStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILockApplicationHostStatics(): ILockApplicationHostStatics {
      val refiid = Guid.REFIID(ILockApplicationHostStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.LockScreen.LockApplicationHost".toHandle(),refiid,interfacePtr)
      val result =
          ILockApplicationHostStatics.ABI.makeILockApplicationHostStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LockApplicationHost {
      val address = segment.toRawLongValue()
      return LockApplicationHost(Pointer(address))
    }

    public override fun toNative(obj: LockApplicationHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.ILockApplicationHostStatics_Instance.GetForCurrentView()
  }
}
