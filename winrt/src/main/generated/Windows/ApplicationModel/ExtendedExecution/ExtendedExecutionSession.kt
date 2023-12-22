package Windows.ApplicationModel.ExtendedExecution

import Windows.Foundation.IClosable
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

@ABIMarker(ExtendedExecutionSession.ABI::class)
@Signature("rc(Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionSession;{af908a2d-118b-48f1-9308-0c4fc41e200f})")
@WinRTByReference(brClass = ExtendedExecutionSession.ByReference::class)
public class ExtendedExecutionSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExtendedExecutionSession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1986005099_Interface: IExtendedExecutionSession.WithDefault by lazy {
    as_1986005099()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1986005099_Ptr: JNAPointer? by lazy {
    __1986005099_Interface.__1986005099_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1986005099_Interface, __1260617006_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1986005099(): IExtendedExecutionSession.WithDefault {
    if(pointer == NULL) {
      return(IExtendedExecutionSession.ABI.makeIExtendedExecutionSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExtendedExecutionSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExtendedExecutionSession.ABI.makeIExtendedExecutionSession(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExtendedExecutionSession> {
    public override fun getValue() = ExtendedExecutionSession(pointer.getPointer(0))

    public fun setValue(value: ExtendedExecutionSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExtendedExecutionSession, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionSession".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ExtendedExecutionSession {
      val address = segment.toRawLongValue()
      return ExtendedExecutionSession(Pointer(address))
    }

    public override fun toNative(obj: ExtendedExecutionSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
