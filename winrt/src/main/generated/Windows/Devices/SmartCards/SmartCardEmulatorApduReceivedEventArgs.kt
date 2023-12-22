package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardEmulatorApduReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardEmulatorApduReceivedEventArgs;{d55d1576-69d2-5333-5b5f-f8c0d6e9f09f})")
@WinRTByReference(brClass = SmartCardEmulatorApduReceivedEventArgs.ByReference::class)
public class SmartCardEmulatorApduReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardEmulatorApduReceivedEventArgs.WithDefault,
    ISmartCardEmulatorApduReceivedEventArgsWithCryptograms.WithDefault,
    ISmartCardEmulatorApduReceivedEventArgs2.WithDefault, IWinRTObject {
  private val __697559291_Interface: ISmartCardEmulatorApduReceivedEventArgs.WithDefault by lazy {
    as_697559291()
  }


  private val __583050822_Interface:
      ISmartCardEmulatorApduReceivedEventArgsWithCryptograms.WithDefault by lazy {
    as_583050822()
  }


  private val __149501591_Interface: ISmartCardEmulatorApduReceivedEventArgs2.WithDefault by lazy {
    as_149501591()
  }


  public override val __697559291_Ptr: JNAPointer? by lazy {
    __697559291_Interface.__697559291_Ptr
  }


  public override val __583050822_Ptr: JNAPointer? by lazy {
    __583050822_Interface.__583050822_Ptr
  }


  public override val __149501591_Ptr: JNAPointer? by lazy {
    __149501591_Interface.__149501591_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__697559291_Interface, __583050822_Interface, __149501591_Interface)

  private fun as_697559291(): ISmartCardEmulatorApduReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardEmulatorApduReceivedEventArgs.ABI.makeISmartCardEmulatorApduReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardEmulatorApduReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardEmulatorApduReceivedEventArgs.ABI.makeISmartCardEmulatorApduReceivedEventArgs(ref.value))
  }

  private fun as_583050822(): ISmartCardEmulatorApduReceivedEventArgsWithCryptograms.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardEmulatorApduReceivedEventArgsWithCryptograms.ABI.makeISmartCardEmulatorApduReceivedEventArgsWithCryptograms(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardEmulatorApduReceivedEventArgsWithCryptograms>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardEmulatorApduReceivedEventArgsWithCryptograms.ABI.makeISmartCardEmulatorApduReceivedEventArgsWithCryptograms(ref.value))
  }

  private fun as_149501591(): ISmartCardEmulatorApduReceivedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardEmulatorApduReceivedEventArgs2.ABI.makeISmartCardEmulatorApduReceivedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardEmulatorApduReceivedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardEmulatorApduReceivedEventArgs2.ABI.makeISmartCardEmulatorApduReceivedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardEmulatorApduReceivedEventArgs> {
    public override fun getValue() = SmartCardEmulatorApduReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SmartCardEmulatorApduReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardEmulatorApduReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCardEmulatorApduReceivedEventArgs {
      val address = segment.toRawLongValue()
      return SmartCardEmulatorApduReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SmartCardEmulatorApduReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
