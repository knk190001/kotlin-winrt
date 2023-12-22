package Windows.Networking.NetworkOperators

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

@ABIMarker(HotspotAuthenticationContext.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.HotspotAuthenticationContext;{e756c791-1003-4de5-83c7-de61d88831d0})")
@WinRTByReference(brClass = HotspotAuthenticationContext.ByReference::class)
public class HotspotAuthenticationContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHotspotAuthenticationContext.WithDefault,
    IHotspotAuthenticationContext2.WithDefault, IWinRTObject {
  private val __202522879_Interface: IHotspotAuthenticationContext.WithDefault by lazy {
    as_202522879()
  }


  private val __1983241903_Interface: IHotspotAuthenticationContext2.WithDefault by lazy {
    as_1983241903()
  }


  public override val __202522879_Ptr: JNAPointer? by lazy {
    __202522879_Interface.__202522879_Ptr
  }


  public override val __1983241903_Ptr: JNAPointer? by lazy {
    __1983241903_Interface.__1983241903_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__202522879_Interface, __1983241903_Interface)

  private fun as_202522879(): IHotspotAuthenticationContext.WithDefault {
    if(pointer == NULL) {
      return(IHotspotAuthenticationContext.ABI.makeIHotspotAuthenticationContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHotspotAuthenticationContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHotspotAuthenticationContext.ABI.makeIHotspotAuthenticationContext(ref.value))
  }

  private fun as_1983241903(): IHotspotAuthenticationContext2.WithDefault {
    if(pointer == NULL) {
      return(IHotspotAuthenticationContext2.ABI.makeIHotspotAuthenticationContext2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHotspotAuthenticationContext2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHotspotAuthenticationContext2.ABI.makeIHotspotAuthenticationContext2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HotspotAuthenticationContext> {
    public override fun getValue() = HotspotAuthenticationContext(pointer.getPointer(0))

    public fun setValue(value: HotspotAuthenticationContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HotspotAuthenticationContext, MemoryAddress> {
    public val IHotspotAuthenticationContextStatics_Instance: IHotspotAuthenticationContextStatics
        by lazy {
      createIHotspotAuthenticationContextStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHotspotAuthenticationContextStatics(): IHotspotAuthenticationContextStatics {
      val refiid = Guid.REFIID(IHotspotAuthenticationContextStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.HotspotAuthenticationContext".toHandle(),refiid,interfacePtr)
      val result =
          IHotspotAuthenticationContextStatics.ABI.makeIHotspotAuthenticationContextStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HotspotAuthenticationContext {
      val address = segment.toRawLongValue()
      return HotspotAuthenticationContext(Pointer(address))
    }

    public override fun toNative(obj: HotspotAuthenticationContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryGetAuthenticationContext(evenToken: String, context: ByReference) =
        ABI.IHotspotAuthenticationContextStatics_Instance.TryGetAuthenticationContext(evenToken,
        context)
  }
}
