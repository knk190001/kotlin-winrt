package Windows.Services.Store

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.platform.win32.WinDef
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_DOUBLE
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Double
import kotlin.String
import kotlin.jvm.JvmField

@ABIMarker(StorePackageUpdateStatus.ABI::class)
@Signature("struct(Windows.Services.Store.StorePackageUpdateStatus;string;u8;u8;f8;f8;enum(Windows.Services.Store.StorePackageUpdateState;i4))")
@Structure.FieldOrder("PackageFamilyName, PackageDownloadSizeInBytes, PackageBytesDownloaded, PackageDownloadProgress, TotalDownloadProgress, PackageUpdateState")
@WinRTByReference(brClass = StorePackageUpdateStatus.ByReference::class)
public open class StorePackageUpdateStatus(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var PackageFamilyName: String? = null

  @JvmField
  public var PackageDownloadSizeInBytes: WinDef.ULONG? = null

  @JvmField
  public var PackageBytesDownloaded: WinDef.ULONG? = null

  @JvmField
  public var PackageDownloadProgress: Double? = null

  @JvmField
  public var TotalDownloadProgress: Double? = null

  @JvmField
  public var PackageUpdateState: StorePackageUpdateState? = null

  public class ByReference : StorePackageUpdateStatus(), Structure.ByReference,
      IByReference<StorePackageUpdateStatus> {
    public override fun getValue(): StorePackageUpdateStatus = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : StorePackageUpdateStatus(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(StorePackageUpdateStatus::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      ADDRESS, 
      JAVA_LONG, 
      JAVA_LONG, 
      JAVA_DOUBLE, 
      JAVA_DOUBLE, 
      JAVA_INT, 
    )


    public override fun fromNative(segment: MemorySegment): ByValue {
      val address = segment.address().toRawLongValue()
      return ByValue(Pointer(address))
    }

    public override fun toNative(obj: ByValue): MemorySegment {
      obj.write()
      val address  = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
      return MemorySegment.ofAddress(address, layout.byteSize(), MemorySession.global())
    }
  }
}
