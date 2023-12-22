package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardCryptogramStorageKeyInfo.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardCryptogramStorageKeyInfo;{77b0f00d-b097-4f61-a26a-9561639c9c3a})")
@WinRTByReference(brClass = SmartCardCryptogramStorageKeyInfo.ByReference::class)
public class SmartCardCryptogramStorageKeyInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardCryptogramStorageKeyInfo.WithDefault,
    ISmartCardCryptogramStorageKeyInfo2.WithDefault, IWinRTObject {
  private val __87792816_Interface: ISmartCardCryptogramStorageKeyInfo.WithDefault by lazy {
    as_87792816()
  }


  private val __1573389950_Interface: ISmartCardCryptogramStorageKeyInfo2.WithDefault by lazy {
    as_1573389950()
  }


  public override val __87792816_Ptr: JNAPointer? by lazy {
    __87792816_Interface.__87792816_Ptr
  }


  public override val __1573389950_Ptr: JNAPointer? by lazy {
    __1573389950_Interface.__1573389950_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__87792816_Interface, __1573389950_Interface)

  private fun as_87792816(): ISmartCardCryptogramStorageKeyInfo.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramStorageKeyInfo.ABI.makeISmartCardCryptogramStorageKeyInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardCryptogramStorageKeyInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramStorageKeyInfo.ABI.makeISmartCardCryptogramStorageKeyInfo(ref.value))
  }

  private fun as_1573389950(): ISmartCardCryptogramStorageKeyInfo2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramStorageKeyInfo2.ABI.makeISmartCardCryptogramStorageKeyInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardCryptogramStorageKeyInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramStorageKeyInfo2.ABI.makeISmartCardCryptogramStorageKeyInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardCryptogramStorageKeyInfo> {
    public override fun getValue() = SmartCardCryptogramStorageKeyInfo(pointer.getPointer(0))

    public fun setValue(value: SmartCardCryptogramStorageKeyInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardCryptogramStorageKeyInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCardCryptogramStorageKeyInfo {
      val address = segment.toRawLongValue()
      return SmartCardCryptogramStorageKeyInfo(Pointer(address))
    }

    public override fun toNative(obj: SmartCardCryptogramStorageKeyInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
