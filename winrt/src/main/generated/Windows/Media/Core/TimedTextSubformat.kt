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

@ABIMarker(TimedTextSubformat.ABI::class)
@Signature("rc(Windows.Media.Core.TimedTextSubformat;{d713502f-3261-4722-a0c2-b937b2390f14})")
@WinRTByReference(brClass = TimedTextSubformat.ByReference::class)
public class TimedTextSubformat(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedTextSubformat.WithDefault, IWinRTObject {
  private val __1082267352_Interface: ITimedTextSubformat.WithDefault by lazy {
    as_1082267352()
  }


  public override val __1082267352_Ptr: JNAPointer? by lazy {
    __1082267352_Interface.__1082267352_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1082267352_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1082267352(): ITimedTextSubformat.WithDefault {
    if(pointer == NULL) {
      return(ITimedTextSubformat.ABI.makeITimedTextSubformat(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedTextSubformat>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedTextSubformat.ABI.makeITimedTextSubformat(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimedTextSubformat> {
    public override fun getValue() = TimedTextSubformat(pointer.getPointer(0))

    public fun setValue(value: TimedTextSubformat): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedTextSubformat, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Core.TimedTextSubformat".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): TimedTextSubformat {
      val address = segment.toRawLongValue()
      return TimedTextSubformat(Pointer(address))
    }

    public override fun toNative(obj: TimedTextSubformat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
