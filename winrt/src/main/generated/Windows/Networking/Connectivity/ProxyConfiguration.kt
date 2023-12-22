package Windows.Networking.Connectivity

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

@ABIMarker(ProxyConfiguration.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.ProxyConfiguration;{ef3a60b4-9004-4dd6-b7d8-b3e502f4aad0})")
@WinRTByReference(brClass = ProxyConfiguration.ByReference::class)
public class ProxyConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProxyConfiguration.WithDefault, IWinRTObject {
  private val __402415701_Interface: IProxyConfiguration.WithDefault by lazy {
    as_402415701()
  }


  public override val __402415701_Ptr: JNAPointer? by lazy {
    __402415701_Interface.__402415701_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__402415701_Interface)

  private fun as_402415701(): IProxyConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IProxyConfiguration.ABI.makeIProxyConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProxyConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProxyConfiguration.ABI.makeIProxyConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProxyConfiguration> {
    public override fun getValue() = ProxyConfiguration(pointer.getPointer(0))

    public fun setValue(value: ProxyConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProxyConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProxyConfiguration {
      val address = segment.toRawLongValue()
      return ProxyConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ProxyConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
