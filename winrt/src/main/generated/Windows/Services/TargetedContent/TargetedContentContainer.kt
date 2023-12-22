package Windows.Services.TargetedContent

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TargetedContentContainer.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentContainer;{bc2494c9-8837-47c2-850f-d79d64595926})")
@WinRTByReference(brClass = TargetedContentContainer.ByReference::class)
public class TargetedContentContainer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentContainer.WithDefault, IWinRTObject {
  private val __302983165_Interface: ITargetedContentContainer.WithDefault by lazy {
    as_302983165()
  }


  public override val __302983165_Ptr: JNAPointer? by lazy {
    __302983165_Interface.__302983165_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__302983165_Interface)

  private fun as_302983165(): ITargetedContentContainer.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentContainer.ABI.makeITargetedContentContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentContainer.ABI.makeITargetedContentContainer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentContainer> {
    public override fun getValue() = TargetedContentContainer(pointer.getPointer(0))

    public fun setValue(value: TargetedContentContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentContainer, MemoryAddress> {
    public val ITargetedContentContainerStatics_Instance: ITargetedContentContainerStatics by lazy {
      createITargetedContentContainerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITargetedContentContainerStatics(): ITargetedContentContainerStatics {
      val refiid = Guid.REFIID(ITargetedContentContainerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.TargetedContent.TargetedContentContainer".toHandle(),refiid,interfacePtr)
      val result =
          ITargetedContentContainerStatics.ABI.makeITargetedContentContainerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TargetedContentContainer {
      val address = segment.toRawLongValue()
      return TargetedContentContainer(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetAsync(contentId: String) =
        ABI.ITargetedContentContainerStatics_Instance.GetAsync(contentId)
  }
}
