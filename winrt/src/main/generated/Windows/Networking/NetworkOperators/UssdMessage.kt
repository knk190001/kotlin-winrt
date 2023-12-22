package Windows.Networking.NetworkOperators

import Windows.Networking.NetworkOperators.IUssdMessageFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UssdMessage.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.UssdMessage;{2f9acf82-2004-4d5d-bf81-2aba1b4be4a8})")
@WinRTByReference(brClass = UssdMessage.ByReference::class)
public class UssdMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUssdMessage.WithDefault, IWinRTObject {
  private val __470927359_Interface: IUssdMessage.WithDefault by lazy {
    as_470927359()
  }


  public override val __470927359_Ptr: JNAPointer? by lazy {
    __470927359_Interface.__470927359_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__470927359_Interface)

  public constructor(messageText: String) : this(ABI.activate(messageText))

  private fun as_470927359(): IUssdMessage.WithDefault {
    if(pointer == NULL) {
      return(IUssdMessage.ABI.makeIUssdMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUssdMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUssdMessage.ABI.makeIUssdMessage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UssdMessage> {
    public override fun getValue() = UssdMessage(pointer.getPointer(0))

    public fun setValue(value: UssdMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UssdMessage, MemoryAddress> {
    public val IUssdMessageFactory_Instance: IUssdMessageFactory by lazy {
      createIUssdMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUssdMessageFactory(): IUssdMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.UssdMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUssdMessageFactory.ABI.makeIUssdMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(messageText: String): JNAPointer? =
        IUssdMessageFactory_Instance.CreateMessage(messageText)?.pointer

    public override fun fromNative(segment: MemoryAddress): UssdMessage {
      val address = segment.toRawLongValue()
      return UssdMessage(Pointer(address))
    }

    public override fun toNative(obj: UssdMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
