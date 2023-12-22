package Microsoft.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DropTargetItemThemeAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.DropTargetItemThemeAnimation;{b97f19c0-f1e2-5705-a252-2db05d2e5a54})")
@WinRTByReference(brClass = DropTargetItemThemeAnimation.ByReference::class)
public class DropTargetItemThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IDropTargetItemThemeAnimation.WithDefault, IWinRTObject {
  private val __728062633_Interface: IDropTargetItemThemeAnimation.WithDefault by lazy {
    as_728062633()
  }


  public override val __728062633_Ptr: JNAPointer? by lazy {
    __728062633_Interface.__728062633_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__728062633_Interface)

  public constructor() : this(ABI.activate())

  private fun as_728062633(): IDropTargetItemThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IDropTargetItemThemeAnimation.ABI.makeIDropTargetItemThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropTargetItemThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropTargetItemThemeAnimation.ABI.makeIDropTargetItemThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DropTargetItemThemeAnimation> {
    public override fun getValue() = DropTargetItemThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: DropTargetItemThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DropTargetItemThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDropTargetItemThemeAnimationStatics_Instance: IDropTargetItemThemeAnimationStatics
        by lazy {
      createIDropTargetItemThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.DropTargetItemThemeAnimation".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIDropTargetItemThemeAnimationStatics(): IDropTargetItemThemeAnimationStatics {
      val refiid = Guid.REFIID(IDropTargetItemThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.DropTargetItemThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IDropTargetItemThemeAnimationStatics.ABI.makeIDropTargetItemThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DropTargetItemThemeAnimation {
      val address = segment.toRawLongValue()
      return DropTargetItemThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: DropTargetItemThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IDropTargetItemThemeAnimationStatics_Instance.get_TargetNameProperty()
  }
}
