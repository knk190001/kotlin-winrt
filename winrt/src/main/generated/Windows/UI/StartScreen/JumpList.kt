package Windows.UI.StartScreen

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(JumpList.ABI::class)
@Signature("rc(Windows.UI.StartScreen.JumpList;{b0234c3e-cd6f-4cb6-a611-61fd505f3ed1})")
@WinRTByReference(brClass = JumpList.ByReference::class)
public class JumpList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IJumpList.WithDefault, IWinRTObject {
  private val __1780077142_Interface: IJumpList.WithDefault by lazy {
    as_1780077142()
  }


  public override val __1780077142_Ptr: JNAPointer? by lazy {
    __1780077142_Interface.__1780077142_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1780077142_Interface)

  private fun as_1780077142(): IJumpList.WithDefault {
    if(pointer == NULL) {
      return(IJumpList.ABI.makeIJumpList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJumpList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJumpList.ABI.makeIJumpList(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<JumpList> {
    public override fun getValue() = JumpList(pointer.getPointer(0))

    public fun setValue(value: JumpList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JumpList, MemoryAddress> {
    public val IJumpListStatics_Instance: IJumpListStatics by lazy {
      createIJumpListStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIJumpListStatics(): IJumpListStatics {
      val refiid = Guid.REFIID(IJumpListStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.StartScreen.JumpList".toHandle(),refiid,interfacePtr)
      val result = IJumpListStatics.ABI.makeIJumpListStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): JumpList {
      val address = segment.toRawLongValue()
      return JumpList(Pointer(address))
    }

    public override fun toNative(obj: JumpList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LoadCurrentAsync() = ABI.IJumpListStatics_Instance.LoadCurrentAsync()

    public fun IsSupported() = ABI.IJumpListStatics_Instance.IsSupported()
  }
}
