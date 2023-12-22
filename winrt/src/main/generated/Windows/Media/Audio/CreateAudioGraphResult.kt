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

@ABIMarker(CreateAudioGraphResult.ABI::class)
@Signature("rc(Windows.Media.Audio.CreateAudioGraphResult;{5453ef7e-7bde-4b76-bb5d-48f79cfc8c0b})")
@WinRTByReference(brClass = CreateAudioGraphResult.ByReference::class)
public class CreateAudioGraphResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICreateAudioGraphResult.WithDefault, ICreateAudioGraphResult2.WithDefault,
    IWinRTObject {
  private val __451305735_Interface: ICreateAudioGraphResult.WithDefault by lazy {
    as_451305735()
  }


  private val __1105575847_Interface: ICreateAudioGraphResult2.WithDefault by lazy {
    as_1105575847()
  }


  public override val __451305735_Ptr: JNAPointer? by lazy {
    __451305735_Interface.__451305735_Ptr
  }


  public override val __1105575847_Ptr: JNAPointer? by lazy {
    __1105575847_Interface.__1105575847_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__451305735_Interface, __1105575847_Interface)

  private fun as_451305735(): ICreateAudioGraphResult.WithDefault {
    if(pointer == NULL) {
      return(ICreateAudioGraphResult.ABI.makeICreateAudioGraphResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateAudioGraphResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateAudioGraphResult.ABI.makeICreateAudioGraphResult(ref.value))
  }

  private fun as_1105575847(): ICreateAudioGraphResult2.WithDefault {
    if(pointer == NULL) {
      return(ICreateAudioGraphResult2.ABI.makeICreateAudioGraphResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateAudioGraphResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateAudioGraphResult2.ABI.makeICreateAudioGraphResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CreateAudioGraphResult> {
    public override fun getValue() = CreateAudioGraphResult(pointer.getPointer(0))

    public fun setValue(value: CreateAudioGraphResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CreateAudioGraphResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CreateAudioGraphResult {
      val address = segment.toRawLongValue()
      return CreateAudioGraphResult(Pointer(address))
    }

    public override fun toNative(obj: CreateAudioGraphResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
