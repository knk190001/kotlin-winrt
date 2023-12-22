package Windows.Media.Core

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

@ABIMarker(ChapterCue.ABI::class)
@Signature("rc(Windows.Media.Core.ChapterCue;{72a98001-d38a-4c0a-8fa6-75cddaf4664c})")
@WinRTByReference(brClass = ChapterCue.ByReference::class)
public class ChapterCue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChapterCue.WithDefault, IMediaCue.WithDefault, IWinRTObject {
  private val __76669125_Interface: IChapterCue.WithDefault by lazy {
    as_76669125()
  }


  private val __256643460_Interface: IMediaCue.WithDefault by lazy {
    as_256643460()
  }


  public override val __76669125_Ptr: JNAPointer? by lazy {
    __76669125_Interface.__76669125_Ptr
  }


  public override val __256643460_Ptr: JNAPointer? by lazy {
    __256643460_Interface.__256643460_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__76669125_Interface, __256643460_Interface)

  public constructor() : this(ABI.activate())

  private fun as_76669125(): IChapterCue.WithDefault {
    if(pointer == NULL) {
      return(IChapterCue.ABI.makeIChapterCue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChapterCue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChapterCue.ABI.makeIChapterCue(ref.value))
  }

  private fun as_256643460(): IMediaCue.WithDefault {
    if(pointer == NULL) {
      return(IMediaCue.ABI.makeIMediaCue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCue.ABI.makeIMediaCue(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ChapterCue> {
    public override fun getValue() = ChapterCue(pointer.getPointer(0))

    public fun setValue(value: ChapterCue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChapterCue, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Core.ChapterCue".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): ChapterCue {
      val address = segment.toRawLongValue()
      return ChapterCue(Pointer(address))
    }

    public override fun toNative(obj: ChapterCue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
