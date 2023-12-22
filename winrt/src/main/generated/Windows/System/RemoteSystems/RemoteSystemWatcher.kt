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

@ABIMarker(RemoteSystemWatcher.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemWatcher;{5d600c7e-2c07-48c5-889c-455d2b099771})")
@WinRTByReference(brClass = RemoteSystemWatcher.ByReference::class)
public class RemoteSystemWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemWatcher.WithDefault, IRemoteSystemWatcher2.WithDefault,
    IRemoteSystemWatcher3.WithDefault, IWinRTObject {
  private val __1335123960_Interface: IRemoteSystemWatcher.WithDefault by lazy {
    as_1335123960()
  }


  private val __1560830250_Interface: IRemoteSystemWatcher2.WithDefault by lazy {
    as_1560830250()
  }


  private val __1560830251_Interface: IRemoteSystemWatcher3.WithDefault by lazy {
    as_1560830251()
  }


  public override val __1335123960_Ptr: JNAPointer? by lazy {
    __1335123960_Interface.__1335123960_Ptr
  }


  public override val __1560830250_Ptr: JNAPointer? by lazy {
    __1560830250_Interface.__1560830250_Ptr
  }


  public override val __1560830251_Ptr: JNAPointer? by lazy {
    __1560830251_Interface.__1560830251_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1335123960_Interface, __1560830250_Interface, __1560830251_Interface)

  private fun as_1335123960(): IRemoteSystemWatcher.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemWatcher.ABI.makeIRemoteSystemWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemWatcher.ABI.makeIRemoteSystemWatcher(ref.value))
  }

  private fun as_1560830250(): IRemoteSystemWatcher2.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemWatcher2.ABI.makeIRemoteSystemWatcher2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemWatcher2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemWatcher2.ABI.makeIRemoteSystemWatcher2(ref.value))
  }

  private fun as_1560830251(): IRemoteSystemWatcher3.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemWatcher3.ABI.makeIRemoteSystemWatcher3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemWatcher3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemWatcher3.ABI.makeIRemoteSystemWatcher3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemWatcher> {
    public override fun getValue() = RemoteSystemWatcher(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemWatcher {
      val address = segment.toRawLongValue()
      return RemoteSystemWatcher(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
