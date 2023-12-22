package Windows.Networking.XboxLive

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

@ABIMarker(XboxLiveEndpointPairTemplate.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate;{6b286ecf-3457-40ce-b9a1-c0cfe0213ea7})")
@WinRTByReference(brClass = XboxLiveEndpointPairTemplate.ByReference::class)
public class XboxLiveEndpointPairTemplate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveEndpointPairTemplate.WithDefault, IWinRTObject {
  private val __337754179_Interface: IXboxLiveEndpointPairTemplate.WithDefault by lazy {
    as_337754179()
  }


  public override val __337754179_Ptr: JNAPointer? by lazy {
    __337754179_Interface.__337754179_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__337754179_Interface)

  private fun as_337754179(): IXboxLiveEndpointPairTemplate.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveEndpointPairTemplate.ABI.makeIXboxLiveEndpointPairTemplate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveEndpointPairTemplate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveEndpointPairTemplate.ABI.makeIXboxLiveEndpointPairTemplate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveEndpointPairTemplate> {
    public override fun getValue() = XboxLiveEndpointPairTemplate(pointer.getPointer(0))

    public fun setValue(value: XboxLiveEndpointPairTemplate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveEndpointPairTemplate, MemoryAddress> {
    public val IXboxLiveEndpointPairTemplateStatics_Instance: IXboxLiveEndpointPairTemplateStatics
        by lazy {
      createIXboxLiveEndpointPairTemplateStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXboxLiveEndpointPairTemplateStatics(): IXboxLiveEndpointPairTemplateStatics {
      val refiid = Guid.REFIID(IXboxLiveEndpointPairTemplateStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate".toHandle(),refiid,interfacePtr)
      val result =
          IXboxLiveEndpointPairTemplateStatics.ABI.makeIXboxLiveEndpointPairTemplateStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XboxLiveEndpointPairTemplate {
      val address = segment.toRawLongValue()
      return XboxLiveEndpointPairTemplate(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveEndpointPairTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetTemplateByName(name: String) =
        ABI.IXboxLiveEndpointPairTemplateStatics_Instance.GetTemplateByName(name)

    public fun get_Templates() = ABI.IXboxLiveEndpointPairTemplateStatics_Instance.get_Templates()
  }
}
