package Windows.System.RemoteSystems

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

@ABIMarker(RemoteSystemApp.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemApp;{80e5bcbd-d54d-41b1-9b16-6810a871ed4f})")
@WinRTByReference(brClass = RemoteSystemApp.ByReference::class)
public class RemoteSystemApp(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemApp.WithDefault, IRemoteSystemApp2.WithDefault, IWinRTObject {
  private val __686245485_Interface: IRemoteSystemApp.WithDefault by lazy {
    as_686245485()
  }


  private val __201226395_Interface: IRemoteSystemApp2.WithDefault by lazy {
    as_201226395()
  }


  public override val __686245485_Ptr: JNAPointer? by lazy {
    __686245485_Interface.__686245485_Ptr
  }


  public override val __201226395_Ptr: JNAPointer? by lazy {
    __201226395_Interface.__201226395_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__686245485_Interface, __201226395_Interface)

  private fun as_686245485(): IRemoteSystemApp.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemApp.ABI.makeIRemoteSystemApp(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemApp>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemApp.ABI.makeIRemoteSystemApp(ref.value))
  }

  private fun as_201226395(): IRemoteSystemApp2.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemApp2.ABI.makeIRemoteSystemApp2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemApp2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemApp2.ABI.makeIRemoteSystemApp2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemApp> {
    public override fun getValue() = RemoteSystemApp(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemApp): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemApp, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemApp {
      val address = segment.toRawLongValue()
      return RemoteSystemApp(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemApp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
