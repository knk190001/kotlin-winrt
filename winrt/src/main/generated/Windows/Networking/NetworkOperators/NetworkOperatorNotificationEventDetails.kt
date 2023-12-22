package Windows.Networking.NetworkOperators

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

@ABIMarker(NetworkOperatorNotificationEventDetails.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails;{bc68a9d1-82e1-4488-9f2c-1276c2468fac})")
@WinRTByReference(brClass = NetworkOperatorNotificationEventDetails.ByReference::class)
public class NetworkOperatorNotificationEventDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkOperatorNotificationEventDetails.WithDefault,
    INetworkOperatorTetheringEntitlementCheck.WithDefault, IWinRTObject {
  private val __1253856820_Interface: INetworkOperatorNotificationEventDetails.WithDefault by lazy {
    as_1253856820()
  }


  private val __625063246_Interface: INetworkOperatorTetheringEntitlementCheck.WithDefault by lazy {
    as_625063246()
  }


  public override val __1253856820_Ptr: JNAPointer? by lazy {
    __1253856820_Interface.__1253856820_Ptr
  }


  public override val __625063246_Ptr: JNAPointer? by lazy {
    __625063246_Interface.__625063246_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1253856820_Interface, __625063246_Interface)

  private fun as_1253856820(): INetworkOperatorNotificationEventDetails.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorNotificationEventDetails.ABI.makeINetworkOperatorNotificationEventDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorNotificationEventDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorNotificationEventDetails.ABI.makeINetworkOperatorNotificationEventDetails(ref.value))
  }

  private fun as_625063246(): INetworkOperatorTetheringEntitlementCheck.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorTetheringEntitlementCheck.ABI.makeINetworkOperatorTetheringEntitlementCheck(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorTetheringEntitlementCheck>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorTetheringEntitlementCheck.ABI.makeINetworkOperatorTetheringEntitlementCheck(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkOperatorNotificationEventDetails> {
    public override fun getValue() = NetworkOperatorNotificationEventDetails(pointer.getPointer(0))

    public fun setValue(value: NetworkOperatorNotificationEventDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkOperatorNotificationEventDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        NetworkOperatorNotificationEventDetails {
      val address = segment.toRawLongValue()
      return NetworkOperatorNotificationEventDetails(Pointer(address))
    }

    public override fun toNative(obj: NetworkOperatorNotificationEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
