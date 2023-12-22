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

@ABIMarker(CreateMediaSourceAudioInputNodeResult.ABI::class)
@Signature("rc(Windows.Media.Audio.CreateMediaSourceAudioInputNodeResult;{46a658a3-53c0-4d59-9e51-cc1d1044a4c4})")
@WinRTByReference(brClass = CreateMediaSourceAudioInputNodeResult.ByReference::class)
public class CreateMediaSourceAudioInputNodeResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICreateMediaSourceAudioInputNodeResult.WithDefault,
    ICreateMediaSourceAudioInputNodeResult2.WithDefault, IWinRTObject {
  private val __574728434_Interface: ICreateMediaSourceAudioInputNodeResult.WithDefault by lazy {
    as_574728434()
  }


  private val __636712220_Interface: ICreateMediaSourceAudioInputNodeResult2.WithDefault by lazy {
    as_636712220()
  }


  public override val __574728434_Ptr: JNAPointer? by lazy {
    __574728434_Interface.__574728434_Ptr
  }


  public override val __636712220_Ptr: JNAPointer? by lazy {
    __636712220_Interface.__636712220_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__574728434_Interface, __636712220_Interface)

  private fun as_574728434(): ICreateMediaSourceAudioInputNodeResult.WithDefault {
    if(pointer == NULL) {
      return(ICreateMediaSourceAudioInputNodeResult.ABI.makeICreateMediaSourceAudioInputNodeResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateMediaSourceAudioInputNodeResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateMediaSourceAudioInputNodeResult.ABI.makeICreateMediaSourceAudioInputNodeResult(ref.value))
  }

  private fun as_636712220(): ICreateMediaSourceAudioInputNodeResult2.WithDefault {
    if(pointer == NULL) {
      return(ICreateMediaSourceAudioInputNodeResult2.ABI.makeICreateMediaSourceAudioInputNodeResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateMediaSourceAudioInputNodeResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateMediaSourceAudioInputNodeResult2.ABI.makeICreateMediaSourceAudioInputNodeResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CreateMediaSourceAudioInputNodeResult> {
    public override fun getValue() = CreateMediaSourceAudioInputNodeResult(pointer.getPointer(0))

    public fun setValue(value: CreateMediaSourceAudioInputNodeResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CreateMediaSourceAudioInputNodeResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CreateMediaSourceAudioInputNodeResult {
      val address = segment.toRawLongValue()
      return CreateMediaSourceAudioInputNodeResult(Pointer(address))
    }

    public override fun toNative(obj: CreateMediaSourceAudioInputNodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
