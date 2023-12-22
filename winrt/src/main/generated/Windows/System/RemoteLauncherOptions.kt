package Windows.System

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

@ABIMarker(RemoteLauncherOptions.ABI::class)
@Signature("rc(Windows.System.RemoteLauncherOptions;{9e3a2788-2891-4cdf-a2d6-9dff7d02e693})")
@WinRTByReference(brClass = RemoteLauncherOptions.ByReference::class)
public class RemoteLauncherOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteLauncherOptions.WithDefault, IWinRTObject {
  private val __475215447_Interface: IRemoteLauncherOptions.WithDefault by lazy {
    as_475215447()
  }


  public override val __475215447_Ptr: JNAPointer? by lazy {
    __475215447_Interface.__475215447_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__475215447_Interface)

  public constructor() : this(ABI.activate())

  private fun as_475215447(): IRemoteLauncherOptions.WithDefault {
    if(pointer == NULL) {
      return(IRemoteLauncherOptions.ABI.makeIRemoteLauncherOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteLauncherOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteLauncherOptions.ABI.makeIRemoteLauncherOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteLauncherOptions> {
    public override fun getValue() = RemoteLauncherOptions(pointer.getPointer(0))

    public fun setValue(value: RemoteLauncherOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteLauncherOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.System.RemoteLauncherOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): RemoteLauncherOptions {
      val address = segment.toRawLongValue()
      return RemoteLauncherOptions(Pointer(address))
    }

    public override fun toNative(obj: RemoteLauncherOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
