package Windows.Security.Authentication.Identity.Provider

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

@ABIMarker(SecondaryAuthenticationFactorInfo.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorInfo;{1e2ba861-8533-4fce-839b-ecb72410ac14})")
@WinRTByReference(brClass = SecondaryAuthenticationFactorInfo.ByReference::class)
public class SecondaryAuthenticationFactorInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryAuthenticationFactorInfo.WithDefault,
    ISecondaryAuthenticationFactorInfo2.WithDefault, IWinRTObject {
  private val __584426418_Interface: ISecondaryAuthenticationFactorInfo.WithDefault by lazy {
    as_584426418()
  }


  private val __937349724_Interface: ISecondaryAuthenticationFactorInfo2.WithDefault by lazy {
    as_937349724()
  }


  public override val __584426418_Ptr: JNAPointer? by lazy {
    __584426418_Interface.__584426418_Ptr
  }


  public override val __937349724_Ptr: JNAPointer? by lazy {
    __937349724_Interface.__937349724_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__584426418_Interface, __937349724_Interface)

  private fun as_584426418(): ISecondaryAuthenticationFactorInfo.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryAuthenticationFactorInfo.ABI.makeISecondaryAuthenticationFactorInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryAuthenticationFactorInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryAuthenticationFactorInfo.ABI.makeISecondaryAuthenticationFactorInfo(ref.value))
  }

  private fun as_937349724(): ISecondaryAuthenticationFactorInfo2.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryAuthenticationFactorInfo2.ABI.makeISecondaryAuthenticationFactorInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryAuthenticationFactorInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryAuthenticationFactorInfo2.ABI.makeISecondaryAuthenticationFactorInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecondaryAuthenticationFactorInfo> {
    public override fun getValue() = SecondaryAuthenticationFactorInfo(pointer.getPointer(0))

    public fun setValue(value: SecondaryAuthenticationFactorInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryAuthenticationFactorInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SecondaryAuthenticationFactorInfo {
      val address = segment.toRawLongValue()
      return SecondaryAuthenticationFactorInfo(Pointer(address))
    }

    public override fun toNative(obj: SecondaryAuthenticationFactorInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
