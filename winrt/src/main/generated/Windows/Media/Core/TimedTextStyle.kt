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

@ABIMarker(TimedTextStyle.ABI::class)
@Signature("rc(Windows.Media.Core.TimedTextStyle;{1bb2384d-a825-40c2-a7f5-281eaedf3b55})")
@WinRTByReference(brClass = TimedTextStyle.ByReference::class)
public class TimedTextStyle(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedTextStyle.WithDefault, ITimedTextStyle2.WithDefault,
    ITimedTextStyle3.WithDefault, IWinRTObject {
  private val __1092607710_Interface: ITimedTextStyle.WithDefault by lazy {
    as_1092607710()
  }


  private val __488899408_Interface: ITimedTextStyle2.WithDefault by lazy {
    as_488899408()
  }


  private val __488899409_Interface: ITimedTextStyle3.WithDefault by lazy {
    as_488899409()
  }


  public override val __1092607710_Ptr: JNAPointer? by lazy {
    __1092607710_Interface.__1092607710_Ptr
  }


  public override val __488899408_Ptr: JNAPointer? by lazy {
    __488899408_Interface.__488899408_Ptr
  }


  public override val __488899409_Ptr: JNAPointer? by lazy {
    __488899409_Interface.__488899409_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1092607710_Interface, __488899408_Interface, __488899409_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1092607710(): ITimedTextStyle.WithDefault {
    if(pointer == NULL) {
      return(ITimedTextStyle.ABI.makeITimedTextStyle(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedTextStyle>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedTextStyle.ABI.makeITimedTextStyle(ref.value))
  }

  private fun as_488899408(): ITimedTextStyle2.WithDefault {
    if(pointer == NULL) {
      return(ITimedTextStyle2.ABI.makeITimedTextStyle2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedTextStyle2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedTextStyle2.ABI.makeITimedTextStyle2(ref.value))
  }

  private fun as_488899409(): ITimedTextStyle3.WithDefault {
    if(pointer == NULL) {
      return(ITimedTextStyle3.ABI.makeITimedTextStyle3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedTextStyle3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedTextStyle3.ABI.makeITimedTextStyle3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TimedTextStyle>
      {
    public override fun getValue() = TimedTextStyle(pointer.getPointer(0))

    public fun setValue(value: TimedTextStyle): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedTextStyle, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Core.TimedTextStyle".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): TimedTextStyle {
      val address = segment.toRawLongValue()
      return TimedTextStyle(Pointer(address))
    }

    public override fun toNative(obj: TimedTextStyle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
