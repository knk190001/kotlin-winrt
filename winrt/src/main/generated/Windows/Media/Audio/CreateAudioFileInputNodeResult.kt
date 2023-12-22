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

@ABIMarker(CreateAudioFileInputNodeResult.ABI::class)
@Signature("rc(Windows.Media.Audio.CreateAudioFileInputNodeResult;{ce83d61c-e297-4c50-9ce7-1c7a69d6bd09})")
@WinRTByReference(brClass = CreateAudioFileInputNodeResult.ByReference::class)
public class CreateAudioFileInputNodeResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICreateAudioFileInputNodeResult.WithDefault,
    ICreateAudioFileInputNodeResult2.WithDefault, IWinRTObject {
  private val __1237614843_Interface: ICreateAudioFileInputNodeResult.WithDefault by lazy {
    as_1237614843()
  }


  private val __288645481_Interface: ICreateAudioFileInputNodeResult2.WithDefault by lazy {
    as_288645481()
  }


  public override val __1237614843_Ptr: JNAPointer? by lazy {
    __1237614843_Interface.__1237614843_Ptr
  }


  public override val __288645481_Ptr: JNAPointer? by lazy {
    __288645481_Interface.__288645481_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1237614843_Interface, __288645481_Interface)

  private fun as_1237614843(): ICreateAudioFileInputNodeResult.WithDefault {
    if(pointer == NULL) {
      return(ICreateAudioFileInputNodeResult.ABI.makeICreateAudioFileInputNodeResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateAudioFileInputNodeResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateAudioFileInputNodeResult.ABI.makeICreateAudioFileInputNodeResult(ref.value))
  }

  private fun as_288645481(): ICreateAudioFileInputNodeResult2.WithDefault {
    if(pointer == NULL) {
      return(ICreateAudioFileInputNodeResult2.ABI.makeICreateAudioFileInputNodeResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateAudioFileInputNodeResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateAudioFileInputNodeResult2.ABI.makeICreateAudioFileInputNodeResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CreateAudioFileInputNodeResult> {
    public override fun getValue() = CreateAudioFileInputNodeResult(pointer.getPointer(0))

    public fun setValue(value: CreateAudioFileInputNodeResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CreateAudioFileInputNodeResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CreateAudioFileInputNodeResult {
      val address = segment.toRawLongValue()
      return CreateAudioFileInputNodeResult(Pointer(address))
    }

    public override fun toNative(obj: CreateAudioFileInputNodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
