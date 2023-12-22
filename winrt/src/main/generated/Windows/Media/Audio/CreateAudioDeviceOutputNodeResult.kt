package Windows.Media.Audio

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

@ABIMarker(CreateAudioDeviceOutputNodeResult.ABI::class)
@Signature("rc(Windows.Media.Audio.CreateAudioDeviceOutputNodeResult;{f7776d27-1d9a-47f7-9cd4-2859cc1b7bff})")
@WinRTByReference(brClass = CreateAudioDeviceOutputNodeResult.ByReference::class)
public class CreateAudioDeviceOutputNodeResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICreateAudioDeviceOutputNodeResult.WithDefault,
    ICreateAudioDeviceOutputNodeResult2.WithDefault, IWinRTObject {
  private val __177948056_Interface: ICreateAudioDeviceOutputNodeResult.WithDefault by lazy {
    as_177948056()
  }


  private val __1221422390_Interface: ICreateAudioDeviceOutputNodeResult2.WithDefault by lazy {
    as_1221422390()
  }


  public override val __177948056_Ptr: JNAPointer? by lazy {
    __177948056_Interface.__177948056_Ptr
  }


  public override val __1221422390_Ptr: JNAPointer? by lazy {
    __1221422390_Interface.__1221422390_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__177948056_Interface, __1221422390_Interface)

  private fun as_177948056(): ICreateAudioDeviceOutputNodeResult.WithDefault {
    if(pointer == NULL) {
      return(ICreateAudioDeviceOutputNodeResult.ABI.makeICreateAudioDeviceOutputNodeResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateAudioDeviceOutputNodeResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateAudioDeviceOutputNodeResult.ABI.makeICreateAudioDeviceOutputNodeResult(ref.value))
  }

  private fun as_1221422390(): ICreateAudioDeviceOutputNodeResult2.WithDefault {
    if(pointer == NULL) {
      return(ICreateAudioDeviceOutputNodeResult2.ABI.makeICreateAudioDeviceOutputNodeResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateAudioDeviceOutputNodeResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateAudioDeviceOutputNodeResult2.ABI.makeICreateAudioDeviceOutputNodeResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CreateAudioDeviceOutputNodeResult> {
    public override fun getValue() = CreateAudioDeviceOutputNodeResult(pointer.getPointer(0))

    public fun setValue(value: CreateAudioDeviceOutputNodeResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CreateAudioDeviceOutputNodeResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CreateAudioDeviceOutputNodeResult {
      val address = segment.toRawLongValue()
      return CreateAudioDeviceOutputNodeResult(Pointer(address))
    }

    public override fun toNative(obj: CreateAudioDeviceOutputNodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
