package Windows.Media.Core

import Windows.Foundation.IClosable
import Windows.Media.IMediaFrame
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

@ABIMarker(SceneAnalysisEffectFrame.ABI::class)
@Signature("rc(Windows.Media.Core.SceneAnalysisEffectFrame;{d8b10e4c-7fd9-42e1-85eb-6572c297c987})")
@WinRTByReference(brClass = SceneAnalysisEffectFrame.ByReference::class)
public class SceneAnalysisEffectFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISceneAnalysisEffectFrame.WithDefault, IMediaFrame.WithDefault,
    IClosable.WithDefault, ISceneAnalysisEffectFrame2.WithDefault, IWinRTObject {
  private val __1993308553_Interface: ISceneAnalysisEffectFrame.WithDefault by lazy {
    as_1993308553()
  }


  private val __1156286201_Interface: IMediaFrame.WithDefault by lazy {
    as_1156286201()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1663023049_Interface: ISceneAnalysisEffectFrame2.WithDefault by lazy {
    as_1663023049()
  }


  public override val __1993308553_Ptr: JNAPointer? by lazy {
    __1993308553_Interface.__1993308553_Ptr
  }


  public override val __1156286201_Ptr: JNAPointer? by lazy {
    __1156286201_Interface.__1156286201_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1663023049_Ptr: JNAPointer? by lazy {
    __1663023049_Interface.__1663023049_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1993308553_Interface, __1156286201_Interface, __1260617006_Interface,
        __1663023049_Interface)

  private fun as_1993308553(): ISceneAnalysisEffectFrame.WithDefault {
    if(pointer == NULL) {
      return(ISceneAnalysisEffectFrame.ABI.makeISceneAnalysisEffectFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneAnalysisEffectFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneAnalysisEffectFrame.ABI.makeISceneAnalysisEffectFrame(ref.value))
  }

  private fun as_1156286201(): IMediaFrame.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrame.ABI.makeIMediaFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrame.ABI.makeIMediaFrame(ref.value))
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

  private fun as_1663023049(): ISceneAnalysisEffectFrame2.WithDefault {
    if(pointer == NULL) {
      return(ISceneAnalysisEffectFrame2.ABI.makeISceneAnalysisEffectFrame2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneAnalysisEffectFrame2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneAnalysisEffectFrame2.ABI.makeISceneAnalysisEffectFrame2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneAnalysisEffectFrame> {
    public override fun getValue() = SceneAnalysisEffectFrame(pointer.getPointer(0))

    public fun setValue(value: SceneAnalysisEffectFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneAnalysisEffectFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneAnalysisEffectFrame {
      val address = segment.toRawLongValue()
      return SceneAnalysisEffectFrame(Pointer(address))
    }

    public override fun toNative(obj: SceneAnalysisEffectFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
