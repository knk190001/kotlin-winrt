package Windows.UI.Xaml.Media

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(CompositionTarget.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.CompositionTarget;{26cfbff0-713c-4bec-8803-e101f7b14ed3})")
@WinRTByReference(brClass = CompositionTarget.ByReference::class)
public class CompositionTarget(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositionTarget.WithDefault, IWinRTObject {
  private val __324314463_Interface: ICompositionTarget.WithDefault by lazy {
    as_324314463()
  }


  public override val __324314463_Ptr: JNAPointer? by lazy {
    __324314463_Interface.__324314463_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__324314463_Interface)

  private fun as_324314463(): ICompositionTarget.WithDefault {
    if(pointer == NULL) {
      return(ICompositionTarget.ABI.makeICompositionTarget(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionTarget>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionTarget.ABI.makeICompositionTarget(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionTarget> {
    public override fun getValue() = CompositionTarget(pointer.getPointer(0))

    public fun setValue(value: CompositionTarget): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionTarget, MemoryAddress> {
    public val ICompositionTargetStatics3_Instance: ICompositionTargetStatics3 by lazy {
      createICompositionTargetStatics3()
    }


    public val ICompositionTargetStatics_Instance: ICompositionTargetStatics by lazy {
      createICompositionTargetStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompositionTargetStatics3(): ICompositionTargetStatics3 {
      val refiid = Guid.REFIID(ICompositionTargetStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.CompositionTarget".toHandle(),refiid,interfacePtr)
      val result = ICompositionTargetStatics3.ABI.makeICompositionTargetStatics3(interfacePtr.value)
      return result
    }

    public fun createICompositionTargetStatics(): ICompositionTargetStatics {
      val refiid = Guid.REFIID(ICompositionTargetStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.CompositionTarget".toHandle(),refiid,interfacePtr)
      val result = ICompositionTargetStatics.ABI.makeICompositionTargetStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CompositionTarget {
      val address = segment.toRawLongValue()
      return CompositionTarget(Pointer(address))
    }

    public override fun toNative(obj: CompositionTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_Rendered(handler: EventHandler<RenderedEventArgs?>) =
        ABI.ICompositionTargetStatics3_Instance.add_Rendered(handler)

    public fun remove_Rendered(token: EventRegistrationToken) =
        ABI.ICompositionTargetStatics3_Instance.remove_Rendered(token)

    public fun add_Rendering(handler: EventHandler<IUnknown?>) =
        ABI.ICompositionTargetStatics_Instance.add_Rendering(handler)

    public fun remove_Rendering(token: EventRegistrationToken) =
        ABI.ICompositionTargetStatics_Instance.remove_Rendering(token)

    public fun add_SurfaceContentsLost(handler: EventHandler<IUnknown?>) =
        ABI.ICompositionTargetStatics_Instance.add_SurfaceContentsLost(handler)

    public fun remove_SurfaceContentsLost(token: EventRegistrationToken) =
        ABI.ICompositionTargetStatics_Instance.remove_SurfaceContentsLost(token)
  }
}
