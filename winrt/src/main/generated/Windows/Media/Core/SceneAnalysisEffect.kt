package Windows.Media.Core

import Windows.Media.IMediaExtension
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

@ABIMarker(SceneAnalysisEffect.ABI::class)
@Signature("rc(Windows.Media.Core.SceneAnalysisEffect;{c04ba319-ca41-4813-bffd-7b08b0ed2557})")
@WinRTByReference(brClass = SceneAnalysisEffect.ByReference::class)
public class SceneAnalysisEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISceneAnalysisEffect.WithDefault, IMediaExtension.WithDefault, IWinRTObject {
  private val __700451396_Interface: ISceneAnalysisEffect.WithDefault by lazy {
    as_700451396()
  }


  private val __9720779_Interface: IMediaExtension.WithDefault by lazy {
    as_9720779()
  }


  public override val __700451396_Ptr: JNAPointer? by lazy {
    __700451396_Interface.__700451396_Ptr
  }


  public override val __9720779_Ptr: JNAPointer? by lazy {
    __9720779_Interface.__9720779_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__700451396_Interface, __9720779_Interface)

  private fun as_700451396(): ISceneAnalysisEffect.WithDefault {
    if(pointer == NULL) {
      return(ISceneAnalysisEffect.ABI.makeISceneAnalysisEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneAnalysisEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneAnalysisEffect.ABI.makeISceneAnalysisEffect(ref.value))
  }

  private fun as_9720779(): IMediaExtension.WithDefault {
    if(pointer == NULL) {
      return(IMediaExtension.ABI.makeIMediaExtension(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaExtension>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaExtension.ABI.makeIMediaExtension(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneAnalysisEffect> {
    public override fun getValue() = SceneAnalysisEffect(pointer.getPointer(0))

    public fun setValue(value: SceneAnalysisEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneAnalysisEffect, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneAnalysisEffect {
      val address = segment.toRawLongValue()
      return SceneAnalysisEffect(Pointer(address))
    }

    public override fun toNative(obj: SceneAnalysisEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
