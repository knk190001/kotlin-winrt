package Windows.Devices.SmartCards

import Windows.Foundation.IClosable
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

@ABIMarker(SmartCardChallengeContext.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardChallengeContext;{192a5319-c9c4-4947-81cc-44794a61ef91})")
@WinRTByReference(brClass = SmartCardChallengeContext.ByReference::class)
public class SmartCardChallengeContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardChallengeContext.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1940650734_Interface: ISmartCardChallengeContext.WithDefault by lazy {
    as_1940650734()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1940650734_Ptr: JNAPointer? by lazy {
    __1940650734_Interface.__1940650734_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1940650734_Interface, __1260617006_Interface)

  private fun as_1940650734(): ISmartCardChallengeContext.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardChallengeContext.ABI.makeISmartCardChallengeContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardChallengeContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardChallengeContext.ABI.makeISmartCardChallengeContext(ref.value))
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
      IByReference<SmartCardChallengeContext> {
    public override fun getValue() = SmartCardChallengeContext(pointer.getPointer(0))

    public fun setValue(value: SmartCardChallengeContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardChallengeContext, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCardChallengeContext {
      val address = segment.toRawLongValue()
      return SmartCardChallengeContext(Pointer(address))
    }

    public override fun toNative(obj: SmartCardChallengeContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
