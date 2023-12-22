package Windows.Media.Core

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

@ABIMarker(TimedTextCue.ABI::class)
@Signature("rc(Windows.Media.Core.TimedTextCue;{51c79e51-3b86-494d-b359-bb2ea7aca9a9})")
@WinRTByReference(brClass = TimedTextCue.ByReference::class)
public class TimedTextCue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedTextCue.WithDefault, IMediaCue.WithDefault, IWinRTObject {
  private val __269308444_Interface: ITimedTextCue.WithDefault by lazy {
    as_269308444()
  }


  private val __256643460_Interface: IMediaCue.WithDefault by lazy {
    as_256643460()
  }


  public override val __269308444_Ptr: JNAPointer? by lazy {
    __269308444_Interface.__269308444_Ptr
  }


  public override val __256643460_Ptr: JNAPointer? by lazy {
    __256643460_Interface.__256643460_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__269308444_Interface, __256643460_Interface)

  public constructor() : this(ABI.activate())

  private fun as_269308444(): ITimedTextCue.WithDefault {
    if(pointer == NULL) {
      return(ITimedTextCue.ABI.makeITimedTextCue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedTextCue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedTextCue.ABI.makeITimedTextCue(ref.value))
  }

  private fun as_256643460(): IMediaCue.WithDefault {
    if(pointer == NULL) {
      return(IMediaCue.ABI.makeIMediaCue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCue.ABI.makeIMediaCue(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TimedTextCue> {
    public override fun getValue() = TimedTextCue(pointer.getPointer(0))

    public fun setValue(value: TimedTextCue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedTextCue, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Core.TimedTextCue".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): TimedTextCue {
      val address = segment.toRawLongValue()
      return TimedTextCue(Pointer(address))
    }

    public override fun toNative(obj: TimedTextCue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
