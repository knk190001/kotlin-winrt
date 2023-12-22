package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(ActivationSignalDetector.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.ActivationSignalDetector;{b5bf345f-a4d0-5b2b-8e65-b3c55ee756ff})")
@WinRTByReference(brClass = ActivationSignalDetector.ByReference::class)
public class ActivationSignalDetector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivationSignalDetector.WithDefault, IActivationSignalDetector2.WithDefault,
    IWinRTObject {
  private val __804841312_Interface: IActivationSignalDetector.WithDefault by lazy {
    as_804841312()
  }


  private val __819723154_Interface: IActivationSignalDetector2.WithDefault by lazy {
    as_819723154()
  }


  public override val __804841312_Ptr: JNAPointer? by lazy {
    __804841312_Interface.__804841312_Ptr
  }


  public override val __819723154_Ptr: JNAPointer? by lazy {
    __819723154_Interface.__819723154_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__804841312_Interface, __819723154_Interface)

  private fun as_804841312(): IActivationSignalDetector.WithDefault {
    if(pointer == NULL) {
      return(IActivationSignalDetector.ABI.makeIActivationSignalDetector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivationSignalDetector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivationSignalDetector.ABI.makeIActivationSignalDetector(ref.value))
  }

  private fun as_819723154(): IActivationSignalDetector2.WithDefault {
    if(pointer == NULL) {
      return(IActivationSignalDetector2.ABI.makeIActivationSignalDetector2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivationSignalDetector2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivationSignalDetector2.ABI.makeIActivationSignalDetector2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivationSignalDetector> {
    public override fun getValue() = ActivationSignalDetector(pointer.getPointer(0))

    public fun setValue(value: ActivationSignalDetector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivationSignalDetector, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ActivationSignalDetector {
      val address = segment.toRawLongValue()
      return ActivationSignalDetector(Pointer(address))
    }

    public override fun toNative(obj: ActivationSignalDetector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
