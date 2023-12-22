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

@ABIMarker(CreateAudioDeviceInputNodeResult.ABI::class)
@Signature("rc(Windows.Media.Audio.CreateAudioDeviceInputNodeResult;{16eec7a8-1ca7-40ef-91a4-d346e0aa1bba})")
@WinRTByReference(brClass = CreateAudioDeviceInputNodeResult.ByReference::class)
public class CreateAudioDeviceInputNodeResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICreateAudioDeviceInputNodeResult.WithDefault,
    ICreateAudioDeviceInputNodeResult2.WithDefault, IWinRTObject {
  private val __285244063_Interface: ICreateAudioDeviceInputNodeResult.WithDefault by lazy {
    as_285244063()
  }


  private val __252631311_Interface: ICreateAudioDeviceInputNodeResult2.WithDefault by lazy {
    as_252631311()
  }


  public override val __285244063_Ptr: JNAPointer? by lazy {
    __285244063_Interface.__285244063_Ptr
  }


  public override val __252631311_Ptr: JNAPointer? by lazy {
    __252631311_Interface.__252631311_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__285244063_Interface, __252631311_Interface)

  private fun as_285244063(): ICreateAudioDeviceInputNodeResult.WithDefault {
    if(pointer == NULL) {
      return(ICreateAudioDeviceInputNodeResult.ABI.makeICreateAudioDeviceInputNodeResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateAudioDeviceInputNodeResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateAudioDeviceInputNodeResult.ABI.makeICreateAudioDeviceInputNodeResult(ref.value))
  }

  private fun as_252631311(): ICreateAudioDeviceInputNodeResult2.WithDefault {
    if(pointer == NULL) {
      return(ICreateAudioDeviceInputNodeResult2.ABI.makeICreateAudioDeviceInputNodeResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateAudioDeviceInputNodeResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateAudioDeviceInputNodeResult2.ABI.makeICreateAudioDeviceInputNodeResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CreateAudioDeviceInputNodeResult> {
    public override fun getValue() = CreateAudioDeviceInputNodeResult(pointer.getPointer(0))

    public fun setValue(value: CreateAudioDeviceInputNodeResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CreateAudioDeviceInputNodeResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CreateAudioDeviceInputNodeResult {
      val address = segment.toRawLongValue()
      return CreateAudioDeviceInputNodeResult(Pointer(address))
    }

    public override fun toNative(obj: CreateAudioDeviceInputNodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
