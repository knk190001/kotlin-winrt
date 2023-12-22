package Windows.System

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

@ABIMarker(AppResourceGroupInfo.ABI::class)
@Signature("rc(Windows.System.AppResourceGroupInfo;{b913f77a-e807-49f4-845e-7b8bdcfe8ee7})")
@WinRTByReference(brClass = AppResourceGroupInfo.ByReference::class)
public class AppResourceGroupInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppResourceGroupInfo.WithDefault, IAppResourceGroupInfo2.WithDefault,
    IWinRTObject {
  private val __469813549_Interface: IAppResourceGroupInfo.WithDefault by lazy {
    as_469813549()
  }


  private val __1679318181_Interface: IAppResourceGroupInfo2.WithDefault by lazy {
    as_1679318181()
  }


  public override val __469813549_Ptr: JNAPointer? by lazy {
    __469813549_Interface.__469813549_Ptr
  }


  public override val __1679318181_Ptr: JNAPointer? by lazy {
    __1679318181_Interface.__1679318181_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__469813549_Interface, __1679318181_Interface)

  private fun as_469813549(): IAppResourceGroupInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppResourceGroupInfo.ABI.makeIAppResourceGroupInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppResourceGroupInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppResourceGroupInfo.ABI.makeIAppResourceGroupInfo(ref.value))
  }

  private fun as_1679318181(): IAppResourceGroupInfo2.WithDefault {
    if(pointer == NULL) {
      return(IAppResourceGroupInfo2.ABI.makeIAppResourceGroupInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppResourceGroupInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppResourceGroupInfo2.ABI.makeIAppResourceGroupInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppResourceGroupInfo> {
    public override fun getValue() = AppResourceGroupInfo(pointer.getPointer(0))

    public fun setValue(value: AppResourceGroupInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppResourceGroupInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppResourceGroupInfo {
      val address = segment.toRawLongValue()
      return AppResourceGroupInfo(Pointer(address))
    }

    public override fun toNative(obj: AppResourceGroupInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
