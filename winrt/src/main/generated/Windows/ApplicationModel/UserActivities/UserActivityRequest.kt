package Windows.ApplicationModel.UserActivities

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

@ABIMarker(UserActivityRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivityRequest;{a0ef6355-cf35-4ff0-8833-50cb4b72e06d})")
@WinRTByReference(brClass = UserActivityRequest.ByReference::class)
public class UserActivityRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivityRequest.WithDefault, IWinRTObject {
  private val __670662286_Interface: IUserActivityRequest.WithDefault by lazy {
    as_670662286()
  }


  public override val __670662286_Ptr: JNAPointer? by lazy {
    __670662286_Interface.__670662286_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__670662286_Interface)

  private fun as_670662286(): IUserActivityRequest.WithDefault {
    if(pointer == NULL) {
      return(IUserActivityRequest.ABI.makeIUserActivityRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivityRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivityRequest.ABI.makeIUserActivityRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserActivityRequest> {
    public override fun getValue() = UserActivityRequest(pointer.getPointer(0))

    public fun setValue(value: UserActivityRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivityRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserActivityRequest {
      val address = segment.toRawLongValue()
      return UserActivityRequest(Pointer(address))
    }

    public override fun toNative(obj: UserActivityRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
