package Windows.Media.Control

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

@ABIMarker(SessionsChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Control.SessionsChangedEventArgs;{bbf0cd32-42c4-5a58-b317-f34bbfbd26e0})")
@WinRTByReference(brClass = SessionsChangedEventArgs.ByReference::class)
public class SessionsChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISessionsChangedEventArgs.WithDefault, IWinRTObject {
  private val __1909157215_Interface: ISessionsChangedEventArgs.WithDefault by lazy {
    as_1909157215()
  }


  public override val __1909157215_Ptr: JNAPointer? by lazy {
    __1909157215_Interface.__1909157215_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1909157215_Interface)

  private fun as_1909157215(): ISessionsChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISessionsChangedEventArgs.ABI.makeISessionsChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISessionsChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISessionsChangedEventArgs.ABI.makeISessionsChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SessionsChangedEventArgs> {
    public override fun getValue() = SessionsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SessionsChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SessionsChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SessionsChangedEventArgs {
      val address = segment.toRawLongValue()
      return SessionsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SessionsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
